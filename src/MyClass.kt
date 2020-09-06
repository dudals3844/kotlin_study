//주요 생성자
//class Person constructor(firstName: String){
//
//}
//
// 주요생성자는 constructor 생략 가능
class Person(firstName: String){

}

class User4(name: String, age: Int){
    val myName = name
    // 생성자 초기화 블록
    init {
        println("I am init")

        println("$name,     $age")
    }

    fun sayHello(){
        println("hello $myName")
    }
}
fun main(args: Array<String>){
  val user4 = User4(name = "choi", age = 24)
    user4.sayHello()
}