
class Car(carname: String){


    var carName:String

    init {
        carName = carname
        println("value set by init function")
    }

}

fun main(args:Array<String>){

    var car1 = Car("allion");
    var car2 = Car("Primio");

    //plus is normal explicit function
    var car3 = car1.sub(car2)

    //this add is infix function
    var car4 = car1 add car2

    //adding two object using plus operatior
    // this is and infix function use + as operator
    var car5 = car1 plus car2

    println(car1.carName)
    println(car2.carName)
    println(car3.carName)

    println(car4.carName)

    println(car5)
}

//creating a function of Car class explicitly
fun Car.sub(car:Car): Car{
    return Car(car.carName +" , "+ this.carName)
}

//creating a function of Car class explicitly
infix fun Car.add(car:Car): Car{
    return Car("From infix function :"+car.carName +" , "+ this.carName)
}


//we can also use function as operator
operator infix fun Car.plus(car:Car): Car{
    return Car("From infix function :"+car.carName +" , "+ this.carName)
}