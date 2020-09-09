import java.lang.constant.DirectMethodHandleDesc
import java.net.spi.URLStreamHandlerProvider
import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates


sealed class Shape{
    class Circle(val radius: Double): Shape()
    class Rect(val width: Int, val height: Int): Shape()
}

class Triangle(val bottom: Int , val height: Int): Shape()

fun main(args: Array<String>){
    val shape1: Shape = Shape.Circle(10.0)
    val shape2: Shape = Triangle(10, 4)
}