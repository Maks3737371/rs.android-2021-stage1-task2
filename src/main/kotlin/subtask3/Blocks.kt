package subtask3

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        return when (blockB){
            Int :: class -> blockA.filterIsInstance<Int>().sum()
            String :: class -> blockA.filterIsInstance<String>().joinToString("")
            else -> blockA.filterIsInstance<LocalDate>().max()!!.format(
                DateTimeFormatter.ofPattern("dd.MM.yyyy"))
        }
    }
}
