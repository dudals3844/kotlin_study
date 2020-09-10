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

class MyClass<in T>(){
//    val myVal: T? = null val 프로퍼티 불가
//    var myVal2: T? = null var 프로퍼티 불가
//    fun myFun(): T?{
//        return null
//    } 함수 리턴 타입으로 사용 불가
    fun myFun3(arg: T){}//매개변수 타입으로 선언가능
}

fun main(args: Array<String>){
    val obj = MyClass<Sub>()
//    val obj2: MyClass<Super> = obj error
    val obj3 = MyClass<Super>()
    val obj4: MyClass<Sub> = obj3
}