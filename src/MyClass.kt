import kotlin.properties.Delegates

open class Super{
    constructor(name :String, no :Int){
        println("Super... constructor(name $name, no $no)")
    }
    init {
        println("Super .... init call")
    }
}

class Sub(name :String): Super(name, 10){
    constructor(name: String, no :Int): this(name){
        println("Sub... constructor(name $name, no $no) call")
    }
    init {
        println("Sub ... init call")
    }
}

fun main(args: Array<String>){
    Sub("choi")
    println("--------")
    Sub("min", 24)

}