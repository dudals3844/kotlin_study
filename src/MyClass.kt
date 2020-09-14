import kotlin.reflect.KClass

//
////어노테이션
//
//val myVal: KClass<*> = String::class
//fun myFun(arg: KClass<*>){
//
//}
//
//val myVal2: KClass<String> = String::class
//
//val myVal3: Class<*> = String::class.java

annotation class TestAnnotation1(val count: Int)

annotation class TestAnnotation2(val otherAnn:TestAnnotation1, val arg1: KClass<*>)

class User

@TestAnnotation1(10)
@TestAnnotation2(TestAnnotation1(20), String::class)

class Test{

}

const val myData: Int = 10
@TestAnnotation1(myData)
class Test2{}
