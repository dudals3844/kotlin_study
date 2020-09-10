import java.lang.Exception
import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates

// 제네릭
//타입을 예측할 수 없는 경우


open class Super{
    open fun sayHello(){
        println("I am sayHello")
    }
}

class Sub: Super(){
    override fun sayHello() {
        println("I am sub sayHello...")
    }
}

fun main(args: Array<String>){
    val obj: Super = Sub()
    obj.sayHello()

    val obj2: Sub = obj as Sub
    obj2.sayHello()
}