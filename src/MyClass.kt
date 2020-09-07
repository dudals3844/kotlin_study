import kotlin.properties.Delegates


val myData1 :Int = 10
private val myData2 :String = "hello"
class Myclass1(){}
private class MyClass2(){}
fun myFunc1(){
    println("myFun() call...")
}

private fun myFunc2(){
    println("myFun()2 call...")
}


fun main(args: Array<String>){
    println("$myData1")
    println("$myData2")
    val obj1 = Myclass1()
    val obj2 = MyClass2()
    myFunc1()
    myFunc2()
}