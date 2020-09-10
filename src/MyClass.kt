import java.lang.Exception
import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import javax.print.attribute.SupportedValuesAttribute
import javax.swing.plaf.BorderUIResource
import kotlin.properties.Delegates

// 제네릭
//타입을 예측할 수 없는 경우

//타입제한 복습

class MyClass<T>(val data: T){
    fun myFun(): T{
        return data
    }
    fun myFun2(arg: T){

    }
    fun myFun3(arg: T): T{
        return data
    }
}

fun some2(arg: MyClass<out Number>){
    arg.myFun()
//    arg.myFun2() 타입을 모른다고 에러남
//    arg.myFun3(10)
}

class Test<T>(val num: T){
    fun test(arg: T): T{
        return arg
    }
}


fun main(args: Array<String>){
    some2(MyClass<Number>(10))
    some2(MyClass<Int>(10))

    var test = Test<Int>(5)
    println(test.test(4))

}