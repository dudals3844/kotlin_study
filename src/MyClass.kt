import kotlin.properties.Delegates

open class Super {
    open var x :Int = 10
    open fun someFun(){
        println("Super...someFunc()")
    }
}


class Sub :Super(){
    override var x :Int = 20
    override fun someFun() {
        super.someFun()
        println("Sub....${super.x}.....$x")
    }
}


fun main(args: Array<String>){
    var sub = Sub()
    sub.someFun()
}