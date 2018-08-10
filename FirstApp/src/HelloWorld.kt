
fun main(args:Array<String>) {

    print("Hello World !")

    // constant
    val pi = 3.14
    //pi = 3.141    It is invalid

    // variable
    var age = 30
    //age = 30  It is valid

    val no = 10 // Integer
    // Typecasting of integer to double
    val money:Double = no.toDouble()

    val x = 34.56   // Double
    // Typecasting of double into integer
    val y:Int = x.toInt()

    // Strings
    val name = "John"
    val greeting = "Hello $name"
    // greeting = "Hello John"

    val n1 = 23
    val n2 = 10
    val result = "n1 * n2 = ${n1*n2}"
    // result = "n1 * n2 = 230"

    // Multiline strings
    val multiline = """
        This is first line
        This is second line
        This is third line
    """
    print(multiline)
}
