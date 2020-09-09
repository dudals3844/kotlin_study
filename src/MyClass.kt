import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates

//null 안정성

fun main(args: Array<String>){
    var data1: String? = "choi"
    val length1: Int? = if(data1 != null){
        data1.length
    } else{
        null
    }
    println(length1)

    var length2: Int? = data1?.length
    println(length2)
}