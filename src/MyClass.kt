import kotlin.properties.Delegates


interface MyInterface6{
    fun myFunc4()
}

interface MyInterface7{
    fun myFunc5()
}

open class Super{

}
class Sub: Super(), MyInterface6, MyInterface7{
    override fun myFunc4() {
        TODO("Not yet implemented")
    }

    override fun myFunc5() {
        TODO("Not yet implemented")
    }
}

fun main(args: Array<String>){


}