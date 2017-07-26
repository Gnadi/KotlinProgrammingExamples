/**
 * Created by gnadlinger on 18.06.17.
 */
@file:JvmName("Johannes")
fun main(args: Array<String>) {
    println(MyJavaFile.getArea(2,4))
    print("Volume is ${calcVolume(b=10,a=9,h=90)}")
}
fun add(a:Int,b:Int):Int=a+b

@JvmOverloads
fun calcVolume(a: Int, b: Int, h: Int = 10): Int {
    println("Length is $a")
    println("Width is $b")
    println("Height is $h")
    return a * b * h
}

