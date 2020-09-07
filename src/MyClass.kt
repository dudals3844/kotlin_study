import kotlin.properties.Delegates

class Product(val name :String, val price :Int)

data class User(val name:String, val age :Int)



fun main(args: Array<String>){
    var product = Product("prod1", 100)
    var product1 = Product("prod1", 100)
    println(product.equals(product1))

    var user = User("choi", 30)
    var user1 = User("choi", 30)

    println(user.equals(user1))
}