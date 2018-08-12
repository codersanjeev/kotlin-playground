fun main(args:Array<String>){

    var num : Int? = 2
    // num can be null i.e. absence of value

    // num += 1
    // above expression is invalid
    // as num is boxed and we need to extract the value from it
    // it can be done using following expression
    num = num!! + 1
    // it is not safe to use as it may give NullPointerException

    // Smart Casting
    if(num != null){
        num += 1
        // Now this statement is valid
    }
    else{
        println("Num us null")
    }

    // Safe calls
    var name: String? = "John"

    if(name != null){
        println(name.length)
    }

    // The above logic can be performed in one line
    println(name?.length)

    name?.let {
        // it == unwrapped version of name

    }

    // elvis operator
    // assign "null" to x if name is null
    var x = name ?: "null"



}