import kotlin.properties.Delegates

open class Shape {
    var x :Int = 0
        set(value) {
            if(value < 0) field = 0
            else field = value
        }
    var y :Int = 0
        set(value) {
            if (value < 0) field = 0
            else field = value
        }

    lateinit var name :String

    fun print(){
        println("$name : location: $x $y")
    }
}

class Rect: Shape(){
    var width :Int = 0
        set(value) {
            if (value < 0) field = 0
            else field = value
        }

    var height :Int = 0
        set(value) {
            if (value < 0) field = 0
            else field = value
        }
}

class Circle: Shape(){
    var r :Int = 0
        set(value) {
            if (value < 0) field = 0
            else field = value
        }
}




fun main(args: Array<String>){
    val obj1: Any = Shape()
    val obj2: Any = Shape()

    val obj3 = obj1
    println("${obj1.equals(obj2)}")
    println("${obj1.equals(obj3)}")
}
