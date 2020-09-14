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


val myVal:Int = 10
var myVar: Int = 10

val referenceVal1: KProperty<*> = ::myVal
val referenceVal2: KProperty<*> = ::myVar

//val referenceVal4: KMutableProperty<*> = ::myVar
fun main(args: Array<String>){
    println(::myVal.get())
    ::myVar.set(40)
    println(::myVar.get())
    println(::myVal.isFinal)
}