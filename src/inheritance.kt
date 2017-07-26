/**
 * Created by gnadlinger on 19.06.17.
 */
fun main(args: Array<String>) {
    var dog = Dog("abc","white")
    //dog.name = "foo"
    dog.bark()
    dog.eat()

}

open class Animal(open var name:String){
    open fun eat() {
        println("Animal eating")
    }

}

class Dog(name: String, var breed: String = "pug") : Animal(name) {

    fun bark(): Unit {
        println("${this.name} macht Wuff und ist ${breed}")
    }

    override fun eat() {
        super<Animal>.eat() //runs the code in animal first
        println("${this.name}  eats")
    }


    override var name: String = "abc"

}