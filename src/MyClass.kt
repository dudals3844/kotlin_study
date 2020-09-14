import java.lang.Exception
import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import javax.print.attribute.SupportedValuesAttribute
import javax.swing.plaf.BorderUIResource
import kotlin.properties.Delegates
import kotlin.reflect.KClass
import kotlin.reflect.KMutableProperty
import kotlin.reflect.KProperty
//
////어노테이션
//
//val myVal: KClass<*> = String::class
//fun myFun(arg: KClass<*>){
//
//}
//
//val myVal2: KClass<String> = String::class
//
//val myVal3: Class<*> = String::class.java

annotation class TestAnnotation

class Test @TestAnnotation constructor(){
    @TestAnnotation
    val myVal: Int = 10
    var myVal2: Int = 10
        @TestAnnotation set(value) {field = value}
    val myFun = @TestAnnotation{

    }
}