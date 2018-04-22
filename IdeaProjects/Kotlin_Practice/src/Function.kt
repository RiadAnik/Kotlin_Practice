
//working kotlin without creating any class kotlin will create class inside
fun main(args: Array<String>){

    //creating variable as int type without declaring its type
    var a = 20

    //creating variable as int type without declaring its type
    //var for identification as it is a variable can be changed in future
    //variable name same as other language
    // variable type will be placed after the variable name separated by a clone

    //var identity variable name : variable type
    var b:Int = 10

    //calling a function from main method
    sum(a,b)

    //call overload method
    sum(a)

    var sum = sumWithReturnValue(a,b)

    print("add $a and $b using function that return its summation $sum")


    //we can not store a stringn to sum

    //sum = "string"

    //printing string witout concating

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

    //we can also use if else statement inside print function
    //print("$name is $age years old , height $height , weight $weight and his maritial status is ${if(isMarried) print("married") else print("single")} ")
    print("$name is $age years old , height $height , weight $weight and his maritial status is $isMarried ")
}

// we can use default value in a function
// we can call overload method as sum(a) of as sum(a,b)
fun sum(a: Int,b:Int =10){

    //we can do arithmatic operation inside println function
    println("printing from sum function the sum of $a and $b is ${a+b}")

    var i:Int = 10;

    println("jnu exam question $i ${i++} ${++i}")
}

//function with return value
fun sumWithReturnValue(a:Int, b:Int): Int{

    //return sum of a and b
    return a+b
}

//inline function
fun add(a:Int, b:Int): Int = a+b

//fun sum(a:Int , b:Int):Double{
 // return a+.5
//}
