/**
 * Created by gnadlinger on 19.06.17.
 */

fun main(args: Array<String>) {
    Customer.id = 1
    println(Customer.registerCustomer())
    Customer.myMethod("Foo")
}

open class MySuperClass{
    open fun myMethod(str:String){
        println("super class")
    }

}
object Customer : MySuperClass() {
    var id: Int = 1
    fun registerCustomer():String{
        return "registered"
    }

    override fun myMethod(str: String) {
        super.myMethod(str)
        println(str)
    }
    init {

    }
}