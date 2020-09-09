import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates


enum class Direction(var no: Int, val str: String){
    NORTH(1,"north"), SOUTH(2,"south"), WEST(3,"west"), EAST(4,"east")
}


fun main(args: Array<String>){
    val direction: Direction = Direction.NORTH
    println("${direction.no}....${direction.str}")

    direction.no = 10
    println("${direction.no}....${direction.str}")

}