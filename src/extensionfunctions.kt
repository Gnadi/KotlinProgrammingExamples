/**
 * Created by gnadlinger on 18.06.17.
 */
fun main(args: Array<String>) {
    var str1:String="Hello "
    var str2: String = "World"
    var str3: String = "Hey "
    print(str3.add(str1,str2))

    val x:Int=8
    val y:Int=10
    println(x.isbigger(y))

}

fun Int.isbigger(y: Int): Boolean = this > y

fun String.add(str:String,str1:String):String=this+str+str1