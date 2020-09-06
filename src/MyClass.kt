

class MyClass{
    var name: String = "world"

    fun sayHello(){
        println("hello $name")

    }

}


fun main(args: Array<String>){
    val obj1 = MyClass()
    val obj2 = MyClass()
    obj1.sayHello()
}