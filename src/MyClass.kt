import java.awt.event.MouseAdapter
import java.io.*
import java.net.Socket
import kotlin.math.atan2

fun main(args: Array<String>){
    val a = 5
    if(a < 10){
        println("$a < 10")
    } else if (a > 10 && a <= 20){
        println("10 < $a <= 20")
    }


    //switch랑 비슷
    when(a){
        5 -> println("Hello")
    }

    for(i in 1..10){
        println(i)
    }

    var list = listOf("Hello", "World", "!!")
    val sb = StringBuffer()
    for (str in list){
        sb.append(str)
    }
    print(sb)
}



