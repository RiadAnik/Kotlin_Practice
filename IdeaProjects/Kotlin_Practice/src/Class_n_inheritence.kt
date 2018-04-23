
//every class is final by default so we have to declare it open if we want to inherit it
open class Person{
    //every method in kotlin super class are
    open fun show(){
        print("hey this is super class")
    }
}

class Human: Person(){
    override fun show() {
        super.show()
    }
}

fun main(args: Array<String>){
    Human().show()
}