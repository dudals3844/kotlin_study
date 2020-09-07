import kotlin.properties.Delegates


abstract class AbstractTest1{
    val data1 :Int = 10
    abstract val data2 :Int
    fun myFun1(){

    }
    abstract fun myFun2()
}

class Sub: AbstractTest1(){
    override val data2 :Int = 15
    override fun myFun2() {
        TODO("Not yet implemented")
    }
}

fun main(args: Array<String>){
    val obj1 = Sub()
}