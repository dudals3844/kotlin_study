import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates


enum class Direction(val no: Int){
    NORTH(1), SOUTH(2), WEST(3), EAST(4)
}


fun main(args: Array<String>){
    val direction: Direction = Direction.NORTH
    println(Direction.NORTH.no)
}