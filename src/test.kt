import kotlin.math.max




fun main(){
    var a = 1
    var s1 = "a is $a"
    println(s1)
    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    print(s2)
}

