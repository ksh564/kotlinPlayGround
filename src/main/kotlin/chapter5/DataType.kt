package chapter5

class DataType {
}
fun main(args: Array<String>){

    println(cases(1))
    println(cases(10))
}

fun cases(obj: Any): String{

    when(obj) {
        1 -> return "One"
        "Hello" -> return "String Hello"
        is Long -> return "Long"
        !is String -> return "Not a String"
        else -> return "unknown"
    }
}