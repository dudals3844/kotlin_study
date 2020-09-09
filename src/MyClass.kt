import java.lang.Exception
import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates

class Test{
    val classData: Int = 0
}

val Test.extensionData2: Int
    get() = 10

fun main(args: Array<String>){
    val obj = Test()
    println("classData ${obj.classData}... extensionData2: ${obj.extensionData2}")
}