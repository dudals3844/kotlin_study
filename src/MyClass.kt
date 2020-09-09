import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates



fun main(args: Array<String>){
    val anomyFun = fun(x: Int): Int = x *10
    val anomyFun2 = fun(x: Int): Int{
        println("I am anonymous function")
        return x * 10
    }

    println(anomyFun(5))
    println(anomyFun2(10))
}