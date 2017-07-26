/**
 * Created by gnadlinger on 17.06.17.
 */
fun main(args: Array<String>) {
    val a = 2
    val b = 5

    var maxValue:Int=if(a>b)
                        a
                    else
                        b
    println(maxValue)

    val x = 1

    var str:String=
    when (x) {
        in 1..20 -> "1<x<20"
        2,3 -> "x is 2 or 3"
        else -> "unkown"

    }
    println(str)
}