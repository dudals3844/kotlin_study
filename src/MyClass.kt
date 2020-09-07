import kotlin.properties.Delegates


interface MyInterface10{
    fun myInterfaceFun()
}

open class Super1{
    fun mySuperFunc(){
        println("mySuperFun")
    }
}

class Sub1: Super1(), MyInterface10{
    override fun myInterfaceFun() {
        println("myInterfaceFun cal.....")
    }
}


fun main(args: Array<String>){
    val obj1: Sub1 = Sub1()
    val obj2: Super1 = Sub1()
    val obj3: MyInterface10 = Sub1()

    obj1.mySuperFunc()
    obj1.myInterfaceFun()

    obj2.mySuperFunc()
//    obj2.myInterfaceFun() //error

//    obj3.mySuperFunc() //error
    obj3.myInterfaceFun()

}