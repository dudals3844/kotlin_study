import kotlin.math.max

fun sum(a: Int, b: Int): Int{
    return a + b
}

var a = 1
var b = 3
var c = sum(a, b)


fun maxOf(a: Int, b: Int): Int{
    if (a>b){
        return a
    }
    else{
        return b
    }
}

fun main(){
    println("hello kotlin")

    c = sum(a, b)
    println(c)
    var d = 1
    d += 1
    println(d)
    var e = maxOf(a, b)
    println(e)
}

