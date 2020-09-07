//주요 생성자
//class Person constructor(firstName: String){
//
//}
//
// 주요생성자는 constructor 생략 가능

val someData: String by lazy {
    println("I am someData lazy....")
    "hello"
}

class User1{
    val name: String by lazy {
        println("I am name lazy")
        "choi"
    }

    val age: Int by lazy {
        println("I am age lazy")
        24
    }

    init {
        println("I am init")
    }
    constructor(){
        println("I am constructor")

    }
}
fun main(args: Array<String>){
    val user1 = User1()
    println(user1.name)
    println(user1.age)
}
