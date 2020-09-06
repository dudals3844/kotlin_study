import kotlin.math.max


fun getString(obj: Any?): Int?{//?는 Null값이 올수도 있다는 말이다
    if(obj is String){
        return obj.length
    }

    return null
}


fun main(){
    var items = listOf("apple", "banana","kiwi")
    for (item in items){
        println(item)
    }
}

