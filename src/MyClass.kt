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


class MyClass<T>{ //T는 무슨 타입인지 모를때 제네릭 선언
    var info: T? = null
    fun sayInfo(){
        println(info)
    }
}

fun main(args: Array<String>){
    val obj1 =MyClass<String>()
    obj1.info = "hello"
    obj1.sayInfo()
    val obj2 = MyClass<Int>()
    obj2.info = 10
    obj2.sayInfo()
}