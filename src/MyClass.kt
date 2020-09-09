import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates


data class User(val name:String, val age :Int)



fun main(args: Array<String>){
    var user = User("choi", 25)

    println(user.toString())

    var user2 = user.copy(name = "young")
    println(user2.toString())

}