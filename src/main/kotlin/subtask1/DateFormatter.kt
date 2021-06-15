package subtask1

//import sun.util.resources.ext.CalendarData_ru
import java.time.DateTimeException
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatter.ofPattern
import java.util.*

class DateFormatter {
    val c = Calendar.DAY_OF_WEEK

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        val yearInt = year.toInt()
        val monthInt = month.toInt()
        val dayInt = day.toInt()
        val result: String
        try{
            result = LocalDate.of(yearInt, monthInt, dayInt).format(DateTimeFormatter.ofPattern("d MMMM, EEEE").withLocale(Locale("ru")))

        }
        catch (e: DateTimeException){
            return "Такого дня не существует"
        }
        return result
    }

}
