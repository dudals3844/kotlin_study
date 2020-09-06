//주요 생성자
//class Person constructor(firstName: String){
//
//}
//
// 주요생성자는 constructor 생략 가능

class User {
    var name :String = "choi"
    val age :Int = 25

}

fun main(args: Array<String>){
    val user = User()

    user.name = "choi"

    println("${user.name}")
    println("${user.age}")
}