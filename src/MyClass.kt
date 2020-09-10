import java.lang.Exception
import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import javax.print.attribute.SupportedValuesAttribute
import javax.swing.plaf.BorderUIResource
import kotlin.properties.Delegates

// 제네릭
//타입을 예측할 수 없는 경우

//타입제한 복습

class MathUtil<T: Number>{//숫자에 관련된 타입으로 제약한다
    fun plus(arg1: T, arg2: T): Double{
        return arg1.toDouble() + arg2.toDouble()
    }
}

fun main(args: Array<String>){
    val obj = MathUtil<Int>()
    obj.plus(10, 20)

    val obj2 = MathUtil<Double>()
}