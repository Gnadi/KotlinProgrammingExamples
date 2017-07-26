/**
 * Created by gnadlinger on 18.06.17.
 */

fun main(args: Array<String>) {
    var student = Student("Johannes")
    var teacher = Teacher("Foo",1)

    println("Name of the student is ${student.name}")
    println("Id of the teacher is ${teacher.id}")
}

class Student(_name: String){
    var name:String=""
    init {
        this.name=_name
    }
}

class Teacher(var name: String){
    var id: Int = 0

    init {
        println("Teacher name $name and Id is $id")
    }

    constructor(n: String, id: Int) : this(n){
        //called after init
        this.id = id

    }

}
