fun main(args:Array<String>){

    // numbers type is Int inferred by kotlin automatically
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    numbers.add(6)

    // values type is Any, which means it can contain value of any type
    val values = mutableListOf(1, 2, 3, "Mary", "Doe")
    values.add("Kim")

    // Extension functions
    val names = listOf("John", "Mary", "David", "Alex")

    println(names.toBulletList())

}

fun List<String>.toBulletList():String{

    var separator = "\n - "
    return this.map {
        "$it"
    }.joinToString(separator, prefix = separator, postfix = "\n")

}

/**
 * Generic Functions
 */
// Below function will work for Integers only
fun swap(a:Int, b:Int): Pair<Int, Int>{
    return Pair(b, a)
}

fun <T, K> swap(a:T, b:K): Pair<K, T>{
    return Pair(b, a)
}