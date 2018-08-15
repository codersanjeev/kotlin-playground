fun main(args:Array<String>){

    val bmw = BMW("BMW", "Series 3")
    bmw.start()
    bmw.isTurboOn = true

    bmw.performService()

}

/**
 * Inheritence
 */
// Parent Class -> add open keyword to make it available for extension
open class Car(var make:String, var model:String){

    open fun start(){

    }

    open fun performService(){
        println("Do a tire check")
        println("Oil check")
        println("Brake oil check")
    }

}

fun processService(car:Car){

    val bmw = car as? BMW
    bmw?.isTurboOn = true

}

// Child Class
class BMW(make:String, model:String) :Car(make, model){

    var isTurboOn:Boolean = false

    override fun start() {
        println("Starting BMW!")
    }

    override fun performService() {
        // first perform basic car check
        // we need to call parent class method
        super.performService()
        println("Perform microfilter check")
    }

}

/**
 * Abstract Classes
 */

abstract class DataAccess(var connectionString:String){

    abstract fun getAllCustomers():Array<String>

}

class SQLDataAccess(connectionString: String):DataAccess(connectionString){

    override fun getAllCustomers(): Array<String> {

        return arrayOf("Mary", "Alex", "Doe", "Jim")

    }

}

/**
 * Class with multiple constructors
 */

class Person(var firstName:String, var lastName:String){

    // to access this property, we need to create it explicitly
    // other are created automatically
    var middleName: String? = null

    constructor(firstName: String, middleName:String, lastName:String):this(firstName, lastName){

        this.middleName = middleName

    }

}