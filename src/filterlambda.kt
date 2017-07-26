/**
 * Created by gnadlinger on 20.06.17.
 */
fun main(args: Array<String>) {
    val mynumbers:List<Int> = listOf<Int>(2, 5, 1, 5, 2, 1, 6, 89)
    val mysmallnumbers: List<Int> = mynumbers.filter { it < 10 }

    for(num in mysmallnumbers)
        println(num)

    println("***************************************")
    val mysquareNums: List<Int> = mynumbers.map { it*it }
    for(num in mysquareNums)
        println(num)
    println("***************************************")

    val mySmallSquareNumbs = mynumbers.filter { it<10 }.map { it * it }
    for(num in mySmallSquareNumbs)
        println(num)


    val newnumbers = listOf<Int>(1, 6, 7, 2, 6, 12)

    val myPredicate ={ num:Int -> num > 10}


    val check1 = newnumbers.all (myPredicate) //are all numbers greater than 10? Boolean
    println(check1)

    val check2 = newnumbers.any( myPredicate) //is any number greater than 10? Boolean
    println(check2)

    val count = newnumbers.count(myPredicate) //counts numbers that are greater than 10 Int
    println(count)

    val num = newnumbers.find (myPredicate) //first element thats greater than 10
    println(num)


}