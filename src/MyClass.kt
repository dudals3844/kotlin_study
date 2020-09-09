import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates

//null 안정성

fun main(args: Array<String>){
    val array = arrayOf("hello", null, "kkang")
    array.forEach {
        if (it != null){
            print(" $it ..... ${it.length}")
        }
    }

    array.forEach {
        it?.let {
            println("$it......${it.length}")
        }
    }
}