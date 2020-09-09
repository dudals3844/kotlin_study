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
    val user = User()
    val user3 = user.apply {
        name = "choi"
        sayHello()
        sayInfo()
    }


    println("user name: ${user.name}... ${user3.name}")
    user.name = "aaa"
    user3.name = "bbb"
    println("user name: ${user.name}... ${user3.name}")

}