import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.properties.Delegates


enum class Direction{
    NORTH, SOUTH, WEST, EAST
}


fun main(args: Array<String>){
    val direction: Direction = Direction.NORTH
    println("${direction.name}.... ${direction.ordinal}")
    val directions :Array<Direction> = Direction.values()
    directions.forEach { t -> println(t.name) }
}