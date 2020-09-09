import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates


fun normalFun(x1: Int, x2: Int):Int{
    return x1 + x2
}


fun hoFunc(x1: Int, argFun:(Int) -> Int){
    val result = argFun(x1)
    println("x1: $x1,  someFun1: $result")
}



fun main(args: Array<String>){
    hoFunc(30, {x -> x*x})
}