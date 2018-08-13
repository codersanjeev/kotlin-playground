import org.omg.PortableServer.portable.Delegate
import kotlin.math.sqrt
import kotlin.properties.Delegates

fun main(args:Array<String>){

    val shirt = Shirt()
    println(Shirt.totalSold)
    shirt.sold = true
    println(Shirt.totalSold)

    // Using extensions
    println("Cat".isPalindrome)
    println("Mom".isPalindrome)

}

/**
 * Custom getters and setters
 */

class Square(var width: Double){

    var area: Double
        get() {
            return width * width
        }
        set(value) {
            width = sqrt(area)
        }
}

/**
 * Observable Properties
 */
class Shirt {

    companion object {
        var totalSold = 0
    }

    var sold: Boolean by Delegates.observable(false){
        _, old, new ->

        if(new){
            totalSold += 1
        }
    }

}

/**
 * Lazy Properties -> Which are initialized only when they are needed
 */
class Triangle(var sideA: Double, var sideB: Double){

    val hypotenuse: Double by lazy {
        sqrt((sideA*sideA) + (sideB*sideB))
    }

}