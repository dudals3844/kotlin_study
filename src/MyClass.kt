import java.lang.Exception
import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates

class Test{
    companion object{
        var data1: Int = 10
        fun myFun1(){
            println("companion object myFun1....")
        }
    }
}
val Test.Companion.data2: Int
    get() = 20

fun Test.Companion.myFunc2(){
    println("extension myFun2...")
}

fun main(args: Array<String>){
    println("data1:  ${Test.data1}..data2: ${Test.data2}")
    Test.myFun1()
    Test.myFunc2()
}