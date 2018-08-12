fun main(args: Array<String>) {

    /**
     * Ranges
     */
    val closedRange = 0..5
    // closedRange == [0, 5]

    for(index in closedRange){
        print(" $index")
    }

    println()

    val halfOpenRange = 0 until 5
    // halfOpenRange == [0, 5)

    for(index in halfOpenRange){
        print(" $index")
    }

    println()

    val decreasingRange = 5 downTo 0
    // decreasingRange == [5, 0]

    for(index in decreasingRange){
        print(" $index")
    }

    println()

    /**
     * for loops
     */

    for(index in 0..10 step 2){
        // this for loop is equivalent to
        // for(index = 0; index <= 10; index += 2)
        print(" $index")
    }

    /**
     * When expression
     */

    val string = "cat"
    when(string){
        "dog" -> println("Its a Dog")
        "cat" -> println("Its a Cat")
        else -> println("Its not a Dog or Cat")
    }

    val age = 10

    val ageGroup = when(age){
        in 0..2 -> "Infant"
        in 3..12 -> "Child"
        in 13..19 -> "Teenager"
        else -> "Unknown"
    }

    println(ageGroup)

    // Factorial using for loop
    val input = 5
    var factorial = 1
    for(index in 1..input){
        factorial *= index
    }
    println(factorial)


}