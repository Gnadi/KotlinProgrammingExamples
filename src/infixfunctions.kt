/**
 * Created by gnadlinger on 18.06.17.
 */
fun main(args: Array<String>) {

    val x:Int=8
    val y:Int=10
    println(x bigger y ) //the same as x.bigger(y)

}

infix fun Int.bigger(y: Int): Boolean = this > y

