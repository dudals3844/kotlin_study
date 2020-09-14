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

annotation class TestAnnotation(val count: Int)

class Test{
    @TestAnnotation(count = 3)
    fun some(){
        println("Some....")
    }
}

fun main(args: Array<String>){
    val obj: Test = Test()
    val methods = Test::class.java!!.methods

    for (method in methods){
        if (method.isAnnotationPresent(TestAnnotation::class.java)){
            val annotation = method.getAnnotation(TestAnnotation::class.java)
            val count = annotation.count
            for (i in 1..count){
                obj.some()
            }
        }
    }
}