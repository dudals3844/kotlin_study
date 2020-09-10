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

open class Super

class Sub: Super()

class MyClass<out T>(val data: T){
    val myVal: T? = null
//    var myVal2: T? = null 변수 프로퍼티는 사용불가
    fun myFun(): T{
        return data
    }

//    fun myFun3(arg: T){ } 매개변수 타입으로는 사용불가

}


fun main(args: Array<String>){
    val obj = MyClass<Sub>(Sub())
    val obj2: MyClass<Super> = obj //Super인 상위 타입에서는 대입이 가능하다

}