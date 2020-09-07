import kotlin.properties.Delegates


interface MyInterface{
    var data1 :String
    fun myFun1(){
        println("this is myFun1")
    }
    fun myFun2(){

    }
}


class MyClass: MyInterface{
    override var data1 :String = "hello"
    override fun myFun2() {
        println("this is myFun2")
    }
}

fun main(args: Array<String>){
    val obj = MyClass()
    obj.myFun1()
    obj.myFun2()
}