/**
 * Created by gnadlinger on 19.06.17.
 */
fun main(args: Array<String>) {

    var prog = Programm()
    prog.addtwoNumbers(10,4,object :MyInterface{
        override fun execute(sum: Int) {
            println("In interface $sum")
        }
    })


    val myLambda: (Int) -> Unit= { s:Int -> println(s) } //Lambda Expression

    prog.addtwoNumbers(2,7,myLambda)

    var result:Int = 0
    prog.addtwoNumbers2(10,2,{x,y-> result = x + y})
    println("Result is: $result")
}

class Programm{

    //allows to modify outside variable (NOT avaible in Java)
    fun addtwoNumbers2(a: Int, b: Int,action:(Int,Int)-> Unit ){action(a,b)}

    //High level Function
    fun addtwoNumbers(a: Int, b: Int,action:(Int)-> Unit ){
        action(a+b)
    }

    //Interface way
    fun addtwoNumbers(a: Int, b: Int, action:MyInterface){
        action.execute(a+b)
    }

    //classic Function
    fun addtwoNumbers(a: Int, b: Int): Int = a + b

}
interface MyInterface{
    fun execute(sum:Int)
}