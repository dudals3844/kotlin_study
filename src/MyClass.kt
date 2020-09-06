//주요 생성자
//class Person constructor(firstName: String){
//
//}
//
// 주요생성자는 constructor 생략 가능

class User1 {
    var greeting :String = "Hello"
        set(value) {
            field = "Hello" + value
        }
        get() = field.toUpperCase()//대문자로 바꿔준다

    var age: Int = 0
        set(value) {
            if (value > 0){
                field = value
            } else {
                field = 0
            }
        }

}

fun main(args: Array<String>){
    val user1 = User1()
    user1.greeting = "choi"
    println(user1.greeting)
    user1.age = -24
    println("${user1.age}")
}