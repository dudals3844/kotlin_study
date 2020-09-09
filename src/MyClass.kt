import java.lang.Exception
import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates



class MyException(msg: String):Exception(msg){
    val errorData: String = "some error data"
    fun errorFun(){
        println("errorFun call.....")
    }
}

fun some1(){
    throw MyException("My error....")
}

fun main(args: Array<String>){
    try {
        some1()
    } catch (e: MyException){
        println("error message: ${e.toString()}")
        println("error data: ${e.errorData}")
        e.errorFun()
    }
}