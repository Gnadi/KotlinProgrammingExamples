/**
 * Created by gnadlinger on 20.06.17.
 */
fun main(args: Array<String>) {
    var proglamda = ProgramLamda()
    proglamda.reverseDisplay("Hello",{it.reversed()})

    var fruit = Fruit()

    with(fruit){
        name = "Apple"
        price = 100
    }

    fruit.apply {
        name = "Orange"
        price = 100  }.readytosell()
}

class ProgramLamda{
    fun reverseDisplay(str: String,myfunc:(String)->String) {
        println(myfunc(str))
    }
}
class Fruit{
    var name: String = ""
    var price: Int = 0

    fun readytosell(){
        println("Now I am ready to sell")
    }
}