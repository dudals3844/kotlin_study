import java.util.Arrays.asList
import kotlin.math.max



//흐름 제어 구문과 연산자


fun main(args: Array<String>){
    val a = 5 //val은 불변 const개념
    if (a < 10) println("$a < 10")

    //when은 switch와 비슷
    val a2 = 10
    when (a2){
        1 -> println("a2 == 1")
        2 -> println("a2 == 2")
        else -> {
            println("a2 is neither 1 nor 2")
        }
    }


    val data3 = 15
    when(data3){
        !in 1..100 -> println("invalid data")
        in 1..10 -> println("1 <= data3 <= 10")
        in 11..20 -> println("11 <= data3 <= 20")
        else -> println("data3 > 20")
    }


    val list = listOf<String>("hello", "world", "kkang")
    val array = arrayOf<String>("one", "two", "three", "kkang")
    val data4 = "kkang"
    when(data4){
        in list -> println("data4 in list") // 먼저 조건검색에 걸리면 break함
        in array -> println("data4 in array")
    }


    // 반복문
    var sum: Int = 0
    for (i in 1..10){
        sum += i
    }
    println(sum)

    val list2 = listOf("Hello", "World", "!")
    val sb = StringBuffer()
    for (str in list2){
        sb.append(str)
    }
    println(sb)

    for (str in list2){
        println(str)
    }

    if ("Hello" in list2){
        println("Hello in list2")
    }

    // 연산자

    val array1 = arrayOf(10, 20, 30)
    val list1 = asList(1, 2, array1[0], array1[1], array1[2], 100, 200)
    list1.forEach({ println(it)})

    val list3 = asList(1, 2, *array1, 100, 300)
    list3.forEach({ println(it)})

    var data5 = 10
    var resutl = ++data5
    println("result = $resutl, data5 = $data5")


    val int1 = Integer(10)
    val int2 = Integer(10)

    println("${int1 == int2}")
    val a1: Int = 10
    val b1: Int = 5

    val resutl1 = a1 + b1
    val result2 = a1.plus(b1)
    println("$resutl1,   $result2")
}


