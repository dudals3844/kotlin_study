import kotlin.properties.Delegates

//주요 생성자
//class Person constructor(firstName: String){
//
//}
//
// 주요생성자는 constructor 생략 가능

class User {
    var name: String by Delegates.observable("nonValue", {props, old, new ->
        println("old $old ..... new $new")
    })
}


fun main(args: Array<String>){
    val user = User()
    println(user.name)
    user.name = "choi"
    user.name = "young"
    println(user.name)
}
