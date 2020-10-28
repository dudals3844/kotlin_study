import java.awt.event.MouseAdapter
import java.io.*
import java.net.Socket
import kotlin.math.atan2

class MyClass {
    var name: String = "world"
    fun sayHello(){
        println("hell $name")
    }
}


fun main(args: Array<String>){
    val obj1 = MyClass()
    val obj2 = MyClass()
    obj1.name = "choi"
    obj1.sayHello()
}



