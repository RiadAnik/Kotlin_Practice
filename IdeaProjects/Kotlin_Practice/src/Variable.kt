
//printing hello from kotlin without creating any class kotlin will create class inside
fun main(args: Array<String>){

    //creating variable as int type without declaring its type
    var a = 20

    //creating variable as int type without declaring its type
    //var for identification as it is a variable can be changed in future
    //variable name same as other language
    // variable type will be placed after the variable name separated by a clone

    //var identity variable name : variable type
    var b:Int = 10

    // kotlin is smart enough it can understand what types of value are asigning to it
    var sum = a + b

    //we can not store a stringn to sum

    //sum = "string"

    //printing string witout concating
    println("the sum of $a and $b is $sum")

    //Creating a string variable
    var name:String = "Sadikul"

    //Creating a int variable
    var age:Int = 25

    //Creating a float variable , need capital F for declaring float
    var weight:Float = 75.5f

    //Creating a Double variable, need capital D for double
    var height:Double = 5.7895884


    //Creating a boolean variable, need capital B for boolean
    var isMarried:Boolean = false

    //Creating a boolean variable, need capital B for boolean
    var fabLetter: Char = 'S'

    print("$name is $age years old , height $height , weight $weight and his maritial status is $isMarried")
}
