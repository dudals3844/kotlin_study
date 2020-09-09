import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates


data class User(val name:String, val age :Int)



fun main(args: Array<String>){
    var user = User("choi", 25)

    println(user.component1())
    println(user.component2())


    val (name, age) = user
    println("name: $name, age: $age")
}