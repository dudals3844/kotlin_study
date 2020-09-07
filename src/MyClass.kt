import kotlin.properties.Delegates

interface Interface1{
    fun funA()
}

interface Interface2{
    fun funA()
}

open abstract class Super2{
    abstract fun funA()
}

class Sub2: Super2(), Interface1, Interface2{
    override fun funA(){
        println("Sub2 funA....")
    }
}

fun main(args: Array<String>){
    val obj1 = Sub2()
    obj1.funA()
}