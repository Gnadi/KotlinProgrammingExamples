import javafx.geometry.Rectangle2D

/**
 * Created by gnadlinger on 17.06.17.
 */
fun main(args: Array<String>) {

    var rect = Rect()
    rect.length=10
    rect.width=5
    calc(rect)


}
class Rect{
    var length:Int=0
    var width:Int =0
}

fun calc(rect: Rect):Unit {
    print("Fläche ist: ${rect.width*rect.length}")
}