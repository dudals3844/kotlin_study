import java.lang.Exception
import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates

open class Super{
    open fun sayHello(){
        println("Super1....sayHello")
    }
}

class Sub: Super(){
    override fun sayHello() {
        println("Sub1.....sayHello")
    }
}

fun some(obj: Super){
    obj.sayHello()
}

fun main(args: Array<String>){
    some(Sub())
//    Sub()

}