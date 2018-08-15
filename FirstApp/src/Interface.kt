fun main(args:Array<String>){

    val bus = Bus()
    bus.start()
    bus.changeGear(2)

}

interface Vehicle{
    fun start(){
        // default implementation
        println("default implementation inside vehicle interface of start function")
    }
    fun changeGear(gear: Int)
}

class Bus:Vehicle{
    override fun start() {
        super.start()
        println("Starting the bus")
    }

    override fun changeGear(gear: Int) {
        println("Gear changed")
    }
}