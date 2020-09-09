import java.lang.Exception
import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates

// 제네릭
//타입을 예측할 수 없는 경우

//class MyClass{
//    var info: String? = null
//}


class MathUtil<T: Number>{
    fun plus(arg1: T, arg2: T): Double{
        return arg1.toDouble() + arg2.toDouble()
    }
}

fun main(args: Array<String>){
    val obj = MathUtil<Int>()
    var add = obj.plus(10, 20)
    println(add)
    val obj2 = MathUtil<Double>()
}