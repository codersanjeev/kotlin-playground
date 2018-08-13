fun main(args:Array<String>){

    val customer = Customer1("John", "Doe")
    CustomerRepository.addCustomer(customer)

    val user1 = User.newUser("John", "Doe")
    // numberOfUsers is a static field
    // we can access it using User.numberOfUsers
    val user2 = User.newUser("Mary", "Doe")

    println(User.numberOfUsers)

}

data class Customer1(var firstName:String, var lastName:String){

}

// Singleton
object CustomerRepository{

    val allCustomers = mutableListOf<Customer1>()

    fun addCustomer(customer: Customer1){
        allCustomers.add(customer)
    }

}

/**
 * Companion Object === Static Fields
 */

class User private constructor(var firstName: String, var lastName: String){

    companion object {
        var numberOfUsers: Int = 0

        fun newUser(firstName: String, lastName: String) : User{

            numberOfUsers += 1
            return User(firstName, lastName)

        }
    }

}
