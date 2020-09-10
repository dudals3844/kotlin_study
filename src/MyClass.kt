import java.lang.Exception
import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates

// 제네릭
//타입을 예측할 수 없는 경우

class MyClass<T>{
    fun myFun(arg1: T, arg2: T){
        println(arg1?.equals(arg2))
    }
}

fun main(args: Array<String>){
    val obj = MyClass<String>()
    obj.myFun("hello", "hello")
    val obj2 = MyClass<Int?>()
    obj2.myFun(null, 10)

}