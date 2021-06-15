package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var temp = a
        //temp = a.toUpperCase()
        for (char in temp){
            if(!b.contains(char,true)){
                temp = temp.replace(char.toString(), "", true)
            }
        }
        return if(temp.equals(b,true)){
            "YES"
        } else "NO"
    }
}
