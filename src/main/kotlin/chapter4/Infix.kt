package chapter4

infix fun Int.myfun(x: Int): Int {
    return x * x
}

class Infix {
    infix fun infixFun(a: Int){
        println("infixFunc call")
    }
}

fun main(args: Array<String>){

    val obj = Infix()
    obj.infixFun(10)
    // 객체명과 매개변수 값 사이에 함수명을 입력하는 방식으로 사용
    obj infixFun 10
    // 1.함수를 중위 표현식으로 이용하려면 infix로 선언을 해주어야 한다.
    // 2.클래스의 멤버 함수로 선언하거나 클래스의 확장 함수이여야 한다.
    // 3.매개변수가 하나인 함수여야 한다.
    println(10 myfun 10)
    println(10.myfun(10))
}