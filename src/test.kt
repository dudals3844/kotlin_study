import kotlin.math.max


fun getStringLength(obj: Any): Int?{
    if(obj is String){
        return obj.length
    }

    return null
}

fun main(){
    var a = "Strings"

    var leng = getStringLength(obj = a)
    println(leng)
}

