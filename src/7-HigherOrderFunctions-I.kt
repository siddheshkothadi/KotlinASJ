/**
 * A higher-order function is a function that :
 * 1. takes functions as parameters
 * or
 * 2. returns a function.
 */

/** --------------------- Lambda Expressions ----------------------
 * These are the expressions passed as parameters in a higher order function
 * */
val intToStringLambda1 : (Int) -> String = { i : Int -> i.toString() }  // 1. The full syntactic form of lambda expression
val intToStringLambda2 : (Int) -> String = { it.toString() }            // 2. If a function has single parameter, "it" refers to that parameter. So, that can be omitted
val intToStringLambda3 = { i : Int -> i.toString() }                    // 3. A shorter version of the intToStringLambda1 function (Without mentioning the type)
/** ------------------------------------------------------------ **/

/** Returning a value in lambda **/
val sumOfNNaturalNumbers1 : (Int) -> Int = sum@{n : Int -> return@sum n*(n+1)/2 }       // 1. Qualified return syntax
val sumOfNNaturalNumbers2 : (Int) -> Int = { it*(it+1)/2 }                              // 2. Without qualified return syntax

val printNNaturalNumbers : (Int) -> Unit = {n : Int -> for(i in 1..n) { println(i) } }   // 3. Returning Unit (Void) | Note : Return type Unit cannot be omitted
/** ------------------------------------------------------------ **/

/** --------------------- Higher Order Functions --------------------- **/
// Functions as arguments
fun printAndAdd(n : Int , funToAdd : (Int) -> Int, funToPrint : (Int) -> Unit){
    println("All natural numbers from 1 to $n : ")
    funToPrint(n)
    println("Sum of all natural numbers from 1 to $n is ${funToAdd(n)}")
}
/** ------------------------------------------------------------------ **/

fun main(){
    /** Invoking lambdas **/
    println("Invoking lambda function")
    val returnedString : String = intToStringLambda1.invoke(5)
    println("Returned string for 5 is \"$returnedString\"")

    /** -------- Calling Higher Order functions -------- **/
    // 1. Calling the function with pre-defined functions
    println("Calling Higher order function")
    printAndAdd(3, sumOfNNaturalNumbers1, printNNaturalNumbers)

    // 2. Calling the function by defining function in the call itself
    println("Calling Higher order function again")
    printAndAdd(3, { it*(it+1)/2 }, {for(i in 1..it) { println(i) } })
    /** ------------------------------------------------------------ **/

}