import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates


fun normalFun(x1: Int, x2: Int):Int{
    return x1 + x2
}


fun hoFunc(argFun: (Int) -> Int){
    val result = argFun(10)
    println("result: $result")
}



fun main(args: Array<String>){
    hoFunc({x -> x*x})
    val array = arrayOf(10, 20, 15, 22, 8)
    array.filter { x -> x > 10 }
            .forEach{x -> println(x)}

}