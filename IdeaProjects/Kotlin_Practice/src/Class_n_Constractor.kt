
//every class has a primary connstractor
class Animal1{

    //when we creating an object the init block will call automatically
    init {
        println("this is animal_1")
    }

}

//a primary connstractor
class Animal2(var n: String) {
    var name:String

    //a secondary constractor
    constructor(name:String,numberOfDog:Int):this(name)/* call primary connstractor and pass name to it*/
    {

        println("this is animal2 class and nme of animal is $name and number of $name is $numberOfDog")
    }
    init {
        //assinging dog name into name variable
        this.name = n

        println("this is animal2 class and nme of animal is $name")
    }
}

//a primary connstractor
//we can also  assign default value on constractor
//so whenever we create an object there is not mendatory to pass a string through constractor

class Animal3(name:String = "by default Dog") {
    var name:String

    init {
        println("this is animal3 class and name of animal is $name")
        this.name = name
    }
}

fun main(args:Array<String>){

    //create animal1 object it will call init body
    var animal1:Animal1 = Animal1()

    //create animal2 object pass name with constractor
    var animal2:Animal2 = Animal2("CAT")

    //create animal3 object pass name with constractor otherwise it will take default value
    var animal3:Animal3 = Animal3()

    //create animal3 object pass name with constractor otherwise it will take default value
    var animal4:Animal3 = Animal3("Tiger")

    //create animal2 object pass name with secondary constractor
    var animal5:Animal2 = Animal2("Tiger" , 4)

}