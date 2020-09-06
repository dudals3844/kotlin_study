import kotlin.math.max



//기초 데이터 타입

fun getLength(obj: Any): Int{
    if (obj is String){
        return obj.length
    }
    return 0
}

fun main(args: Array<String>){
    println(getLength("Hello"))
    println(getLength(10))

    //val a: Int = null //error
    val b: Int? = null
    println(b)

    //Var Type
    val myVal1: Any = 10
    val myVal2: Any? = myVal1
    println(myVal2)

    var a1: Int = 10
    //var a2: Double = a1 error
    var a2: Double = a1.toDouble()

    // 컬렉션 타입
    var array1 = arrayOfNulls<Any>(3)
    array1[0] = 10
    array1[1] = "hello"
    array1[2] = true

    println("${array1[0]},  ${array1[1]},  ${array1[2]}")

    var emptyArray =Array<String>(3,{""})
    emptyArray[0] = "hello"
    emptyArray[1] = "world"
    emptyArray[2] = "kkang"
    println("${emptyArray[0]} ${emptyArray[1]}. ${emptyArray[2]}")


    val list1 = listOf<String>("hello", "list")
    val iterator1 = list1.iterator()
    while (iterator1.hasNext()){
        println(iterator1.next())
    }

}


