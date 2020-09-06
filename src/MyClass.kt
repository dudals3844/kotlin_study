//주요 생성자
//class Person constructor(firstName: String){
//
//}
//
// 주요생성자는 constructor 생략 가능
class Person(firstName: String){

}
// 기본 생성자
class User1{

}
// 주생성자
class User2(name: String){

}

//보조 생성자
class User3{
    constructor(name: String)
}
fun main(args: Array<String>){
  val user4 = User4(name = "choi", age = 24)
    user4.sayHello()
}