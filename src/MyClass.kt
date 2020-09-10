import java.lang.Exception
import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates

// 제네릭
//타입을 예측할 수 없는 경우

interface MyInterface1
interface MyInterface2

class MyHandler2: MyInterface1, MyInterface2
class MyHandler1: MyInterface1

class MyClass<T> where T: MyInterface2, T:MyInterface1{//13번줄 떄문에 2개의 타입으로 와야된다.

}

fun main(args: Array<String>){
//    val obj = MyClass<MyHandler1>()
    val obj2 =MyClass<MyHandler2>()
}