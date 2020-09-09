import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates

class Product(val name:String, val price:Int)

data class User(val name:String, val age :Int){
    var email :String = "dudals@gmail.com"
}



fun main(args: Array<String>){

    var product = Product("prod1", 100)
    println(product.toString())

    val user2 = User("young", 24)
    user2.email = "choi@hanmial.com"

    println(user2.toString())
}