fun main(args:Array<String>){

    // Array declaration and assignment
    val numbers = arrayOf(1, 2, 3, 4, 5, "John", "Doe")

    // Iterate over the array
    for(index in 0 until numbers.size){
        println(numbers.get(index))
    }

    val names = Array(5) {"John Doe"}
    // names = {"John Doe", "John Doe", "John Doe",
    //             "John Doe", "John Doe" }

    val evenNumbersArray = intArrayOf(2, 4, 6, 8, 10)

    // val members:List<String> = listOf()
    // OR
    // val members = listOf<String>()

    val members = mutableListOf<String>()
    // mutable means list of members can be changed

    members.add("John")
    members.add("Doe")
    members.add("Mary")
    members.add("Steve")

    // get first element in list
    members.first()

    // get last element in list
    members.last()

    if(members.isEmpty()){
        println("Members List is empty!")
    }
    else{
        println("Members List is not empty!")
    }



}