import java.lang.Exception
import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates

// 제네릭
//타입을 예측할 수 없는 경우

//class MyClass{
//    var info: String? = null
//}


class MyClass2<T>(no:T){
    var no = no
    var info: T? = null
    fun sayInfo(){
        println("$no ..... $info")
    }
}

fun main(args: Array<String>){
    val obj3 = MyClass2<Int>(10)
    obj3.info = 20
    obj3.sayInfo()
    val obj4 = MyClass2("hello")
    obj4.info = "world"
    obj4.sayInfo()
}