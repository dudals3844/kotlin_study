import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates



class User(){
    var name: String? = null
    var age: Int? = null

    fun sayHello(){
        println("hello $name")
    }
    fun sayInfo(){
        println("I am $name, $age years old")
    }
}

fun main(args: Array<String>){
    var user = User()
    user.name = "choi"
    user.age = 25
    user.sayHello()
    user.sayInfo()


    val runResult = user.run {
        name = "young"
        age = 24
        sayHello()
        sayInfo()
        10 + 20
    }

    println("run result: $runResult")
}