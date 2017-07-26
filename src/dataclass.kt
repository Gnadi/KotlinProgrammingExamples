/**
 * Created by gnadlinger on 19.06.17.
 */
fun main(args: Array<String>) {
    var foo=Foo("Jo",19);
    var foo1=Foo("Jo",19);
    if (foo == foo1) {
        println("Equal")
    } else {
        println("Not Equal")
    }
    var newfoo = foo.copy(name="Froschi")
    println(newfoo)
}
data class Foo(var name: String, var age: Int){

}
