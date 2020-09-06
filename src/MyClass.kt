//주요 생성자
//class Person constructor(firstName: String){
//
//}
//
// 주요생성자는 constructor 생략 가능

class User5(name: String){
    init {
        println("I am init block $name")
    }

    constructor(name :String, age: Int): this(name){
        println("I am constructor.....$name...$age")
    }

    constructor(name :String, age: Int, email :String): this(name, age){
        println("$name,   $age,  $email")
    }

}

fun main(args: Array<String>){
    val user6 = User5("choi") // 주 생성자
    val user7 = User5("choi", 25)
    val user8 = User5("choi", 35, "dudals3844")
}