/**
 * Extension Property for String type
 */
val String.isPalindrome :Boolean
    get() {
        return this.toLowerCase().reversed() == this.toLowerCase()
    }

val Double.celsius :Double
    get(){
        return (this - 32) * (5/9)
    }

val Double.fahrenheit :Double
    get() {
        return (this * 9/5) + 32
    }