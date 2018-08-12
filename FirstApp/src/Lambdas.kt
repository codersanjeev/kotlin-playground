fun main(args:Array<String>){

    // Anonymous Functions
    val addLambda : (Int, Int) -> Int

    addLambda = {a:Int, b:Int -> Int
        a+b
    }

    val result = addLambda(4, 5)

    println(result)

    /*val squareLambda = {a:Int ->
        a * a
    }
    */

    // In case of Lambdas with single argument
    val squareLambda : (Int) -> Int = {
        it * it
    }

    println(squareLambda(3))

}