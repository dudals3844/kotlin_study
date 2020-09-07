import kotlin.properties.Delegates


interface MyInterface1{
    fun myFun1()
}

interface MyInterface2{
    fun myFun2()
}

interface MyInterface3: MyInterface1, MyInterface2{
    fun myFun3()
}


class MyClass: MyInterface3{
    override fun myFun1() {
        TODO("Not yet implemented")
    }

    override fun myFun2() {
        TODO("Not yet implemented")
    }

    override fun myFun3() {
        TODO("Not yet implemented")
    }
}

fun main(args: Array<String>){
    )
}