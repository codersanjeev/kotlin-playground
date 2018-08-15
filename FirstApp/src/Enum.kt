fun main(args:Array<String>){

    // iterating over enum
    for(directions in Compass.values()){

        println("Index is ${directions.ordinal} and Value is ${directions.name}")

    }

    for(devices in Devices.values()){

        println("${devices.name} -> ${devices.hasFrontFacingCamera}")

    }

    // Get the current device model
    println(Devices.currentDevice())

}

enum class Compass{

    North,
    South,
    East,
    West

}

enum class Devices(var hasFrontFacingCamera: Boolean = true) {

    iPhone3G(false),
    iPhone3GS(false),
    iPhone4,
    iPhone5,
    iPhone6,
    iPhone7,
    iPhone8,
    iPhoneX;

    companion object{
        fun currentDevice() : Devices{
            val index = Devices.values().size - 1
            return Devices.values()[index]

        }
    }

}