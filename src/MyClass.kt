import kotlin.reflect.KClass
import kotlin.system.exitProcess

//
////어노테이션
//

interface MyInterface{
    var data1: String
    fun myFun1(){

    }
    fun myFun2(){

    }
}

class MyClass: MyInterface{
    override var data1: String = "choi"
    override fun myFun2() {

    }
}

fun main(args: Array<String>){
    val obj1 = MyClass()
    obj1.myFun1()
    obj1.myFun2()
}