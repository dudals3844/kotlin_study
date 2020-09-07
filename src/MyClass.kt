import kotlin.properties.Delegates


interface MyInterface4{
    fun myFun4()
}

interface MyInterface5{
    fun myFun5()
}

class MyClass4: MyInterface4, MyInterface5{
    override fun myFun4() {
        TODO("Not yet implemented")
    }

    override fun myFun5() {
        TODO("Not yet implemented")
    }
}

fun main(args: Array<String>){
    var obj = MyClass4()
    print("Hello")


}