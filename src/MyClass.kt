import kotlin.reflect.KClass
import kotlin.system.exitProcess
import kotlin.time.TestClock

//
////어노테이션
//

//추상함수
abstract class AbstractTest1{
    fun myFun1(){

    }
    abstract fun myFun2()
}

//추상 프로퍼티
abstract class AbstractTest2{
    val data1: String = "choi"
    abstract val data2: String
}


