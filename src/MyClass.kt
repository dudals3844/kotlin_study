import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates

//null 안정성

var data1: String = "choi"
var data2: String? = null

fun myFun(arg: String){

}

fun main(args: Array<String>){
//    data2 = "hello"
    val data3: String? = data1
    println(data2)
}