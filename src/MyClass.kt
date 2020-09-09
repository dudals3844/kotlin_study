import java.lang.Exception
import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates

open class Super

class Sub: Super()

fun Super.sayHello(){
    println("Super.sayHello()")
}

fun Sub.sayHello(){
    println("Sub..sayHello()")
}

fun some(obj: Super){
    obj.sayHello()
}

fun main(args: Array<String>){
    some(Sub())
//    Sub()

}