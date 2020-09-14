import kotlin.reflect.KClass
import kotlin.system.exitProcess

//
////어노테이션
//

abstract class Super{
    val data1: Int = 10
    abstract val data2: Int

    fun myFun1(){

    }

    abstract fun myFun2()

}

class Sub: Super(){
    override val data2: Int = 10
    override fun myFun2() {

    }
}


fun main(args: Array<String>){
    val obj1 = Sub()
}