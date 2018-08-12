fun main(args: Array<String>){

    greet("Sanjeev", 20)
    println(add(4, 8))

    // function as arguments
    var functionAdd = ::add
    displayResult(functionAdd, 3, 6)
}

fun displayResult(function:(Int,Int)->Int, a:Int, b:Int){
    val result = function(a, b)
    println(result)
}

// name and age are val not var
fun greet(name: String, age: Int){
    println("Hello $name, Your age is $age")
}

fun add(a: Int, b: Int): Int{
    return a+b
}