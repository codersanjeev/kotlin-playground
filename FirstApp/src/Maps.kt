fun main(args:Array<String>){

    // declaration of a map
    var map = mapOf("key1" to "value1", "key2" to "value2", "key3" to "value3")

    println(map["key2"])
    // "value2

    // Iterating over map
    for((key, value) in map){
        println("$key : $value")
    }

    for(key in map.keys){
        println(key)
    }

    /**
     * Sets
     */

    val names = setOf("Sanjeev","John", "Doe")
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val numberSet = setOf(*numbers)
    println(numberSet)
}