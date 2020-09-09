import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates


fun hoFunc(no: Int, argFun1: (Int)-> Int, argFun2: (Int) -> Boolean){
    println("$no .... ${argFun1(no)}.....${argFun2(no)}")
}



fun main(args: Array<String>){
    hoFunc(10, {it * it}, {it > 10})

}