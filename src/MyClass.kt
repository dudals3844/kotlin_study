//주요 생성자
//class Person constructor(firstName: String){
//
//}
//
// 주요생성자는 constructor 생략 가능

class User4{
    constructor(){}
    constructor(name: String){}
    constructor(name: String, age: Int){}

}

fun main(args: Array<String>){
    val user4 = User4()
    val user5 = User4("choi", 35)
}