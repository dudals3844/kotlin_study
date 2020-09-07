//주요 생성자
//class Person constructor(firstName: String){
//
//}
//
// 주요생성자는 constructor 생략 가능

class User{
    var data: String
    val data2: Int
    init {
        data = "choi"
        data2 = 10
    }
}

class User1 {
    val name1: String = "choi"
    val name2: String? = null
    val name3: String? = null
    val age: Int? = null

}

fun main(args: Array<String>){
    val user1 = User1()
    user1.greeting = "choi"
    println(user1.greeting)
    user1.age = -24
    println("${user1.age}")
}