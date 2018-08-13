fun main(args:Array<String>){

    val customer1 = Customer("John", "Doe")
    println(customer1.fullName)

    val customer2 = customer1
    // Both customer1 and customer2 point to same object
    println(customer1 === customer2)

    val customer3 = Customer("Mary", "Doe")
    println(customer1 == customer3)

    val coordinate1 = Coordinate(95.5, 35.5)
    val coordinate2 = Coordinate(95.5, 35.5)

    if(coordinate1 == coordinate2){
        print("Same Coordinates")
    }
    else{
        print("Different Coordinates")
    }
}

class Customer(var firstName:String, var lastName:String){

    val fullName
        get() = "$firstName $lastName"

}

/**
 * Data Class
 *
 * When the comparison happens between two objects, it is going to compare the values
 * not the references.
 */

data class Coordinate(var latitude:Double, var longitude:Double){

}