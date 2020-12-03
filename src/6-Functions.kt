// Function declaration
// Parameters are defined using Pascal Notation (name : Type)
fun sum(first : Int, second : Int) : Int {
    return first + second
}

/** Default arguments
 * Also, the function below has a Unit return type
 * It is similar to Void in C++ or other languages
 * If no return type is mentioned, then its return type is Unit
 */
fun sayHello(name : String = "No name"){
    println("Hello $name")
}

// Named arguments
// When calling a function, you can name one or more of its arguments
fun lotOfArgs(firstArg : Int, secondArg : Int, thirdArg : Int, lastArg : String){
    val result = (firstArg * secondArg) + thirdArg
    println("$lastArg : result is $result")
}

/** Single expression function ***
 * When a function returns a single expression, the curly braces
 * can be omitted and the body is specified after a = symbol
 * Explicitly declaring return type is optional
 */

// A normal function
fun product(a : Int, b : Int) : Int{
    return a*b
}

// The above function can be replaced by a single expression function
fun productSingleExpression(a : Int, b: Int) = a*b

// Returning Null
fun canReturnNull(it : Int) : Int? {
    if(it==1) return null;
    return it
}

fun main(){
    val addition = sum(1, 2)
    println("Addition of 1 and 2 is $addition")

    // Calling function normally with an argument
    sayHello("Mike")
    // Called without providing any argument
    sayHello()

    // Named arguments
    lotOfArgs(lastArg = "User", secondArg = 3, firstArg = 5, thirdArg = 1)

    println("Product of 3 and 5 is ${productSingleExpression(3,5)}")

    println("First call to canReturnNull = ${canReturnNull(1)}")
    println("Second call to canReturnNull = ${canReturnNull(2)}")
}