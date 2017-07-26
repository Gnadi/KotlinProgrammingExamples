/**
 * Created by gnadlinger on 20.06.17.
 */
fun main(args: Array<String>) {
    /*Immutable
    * listOf
    * mapOf
    * setOf
    *
    * Mutable
    * Arralist,arraylistOf,mutableListOf
    * Hashmap, hashmapOf,mutableMapOf
    * mutableSetOf,hashSetOf*/
    //Array
    var arr = Array<Int>(5){ 1 }

    arr[2]=100
    for (element in arr) {
        println(element)
    }

    //List
    var list = mutableListOf<String>("FOo", "abc")
    list.add("hahaha")
    for (foo in list) {
        println(foo)
    }

    var map = mapOf<Int,String>(2 to "skjfh",42 to "hahahahhahahahah")
    for (element in map.keys) {
        println(map[element])
    }

    var hashmap = HashMap<Int,String>()
    hashmap.put(4, "afsfh")
    hashmap.put(1, "gg")
    hashmap.replace(1,"bg")
    for (element in hashmap.keys) {
        println(hashmap[element])
    }


}