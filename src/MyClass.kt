import kotlin.reflect.KClass
import kotlin.system.exitProcess

//
////어노테이션
//
interface MyInterface4{
    fun myFun4()

}

interface MyInterface5{
    fun myFun5()
}

class MyClass4: MyInterface4, MyInterface5{
    override fun myFun4() {
    }

    override fun myFun5() {

    }
}

fun main(args: Array<String>){

}