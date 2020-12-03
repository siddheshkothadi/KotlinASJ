/**
 * A higher-order function is a function that :
 * 1. takes functions as parameters
 * or
 * 2. returns a function.
 */

/** --------------------- Anonymous Function ---------------------
 * This is like an alternative to a lambda
 * **/
// Representation using anonymous function
val stringToInt : (String) -> Int = fun(str : String) : Int {
    return str.toInt()
}
/** ------------------------------------------------------------ **/

/** --------------------- Higher Order Function --------------------- **/
// 2. Functions as Return Types
fun returnAFunThatPrintsHelloNTimes(n : Int) : (String) -> Unit {
    // Returning a lambda
    return { for(i in 0 until n) println(it) }
}
/** ------------------------------------------------------------ **/

fun main(){
    // Invoking Lambdas
    val returnedInt : Int = stringToInt.invoke("4")
    println("Returned value of \"4\" is $returnedInt")

    /** -------- Calling Higher Order functions -------- **/
    // Function that returns a function
    val returnedFun = returnAFunThatPrintsHelloNTimes(5)
    returnedFun.invoke("Hello")
}