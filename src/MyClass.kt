import java.awt.event.MouseAdapter
import java.io.*
import java.net.Socket

fun main(args: Array<String>){
    var testmap: MutableMap<String, Int> = mutableMapOf(Pair("choi",1), Pair("young", 2), Pair("min",3))
    testmap.put("i", 3)

    println(testmap)
}

open class A{
    private var a: Int
    constructor(a: Int){
        this.a = a

    }

    fun printA(){
        println(a)
    }
}


