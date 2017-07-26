/**
 * Created by gnadlinger on 17.06.17.
 */
fun main(args: Array<String>) {

    myLoop@for (i in 0..10) {
        for (j in 0..5) {
            if (j == 3) {
                break@myLoop
            }
        }
        if (i == 5) {
            break
        }
        println(i)
    }
    for (x in 1..9) {
        if (x == 5) {
            continue //will skip the code below
        }
        print(x)
    }

    outer@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) {
                continue@outer
            }
            println("$j and $i")

        }
    }
}