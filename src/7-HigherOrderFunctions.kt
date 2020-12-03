/**
 * A higher-order function is a function that :
 * 1. takes functions as parameters
 * or
 * 2. returns a function.
 */

/** --------------------- Lambda Expressions ----------------------
 * These are the expressions passed as parameters in a higher order function
 * */
// 1. The full syntactic form of lambda expressions is as follows
val intToStringLambda1 : (Int) -> String = { i : Int -> i.toString() }

// 2. If a function has single parameter, "it" refers to that parameter. So, that can be omitted
val intToStringLambda2 : (Int) -> String = { it.toString() }

// 3. A shorter version of the intToStringLambda1 function (Without mentioning the type)
val intToStringLambda3 = { i : Int -> i.toString() }
/** ------------------------------------------------------------ **/

/** Returning a value in lambda **/

// 1. Qualified return syntax
val sumOfNNaturalNumbers1 : (Int) -> Int = sum@{n : Int ->
    return@sum n*(n+1)/2
}

// 2. Without qualified return syntax
val sumOfNNaturalNumbers2 : (Int) -> Int = { it*(it+1)/2 }

// 3. Returning Unit (Void)
// Note : Return type Unit cannot be omitted
val printNNaturalNumbers : (Int) -> Unit = {n : Int ->
    for(i in 1..n){
        println(i)
    }
}
/** ------------------------------------------------------------ **/

/** --------------------- Anonymous Function --------------------- **/
// Representation using anonymous function
val stringToInt : (String) -> Int = fun(str : String) : Int {
    return str.toInt()
}
/** ------------------------------------------------------------ **/

/** --------------------- Higher Order Functions --------------------- **/

// 1. Functions as arguments
fun printAndAdd(n : Int , funToAdd : (Int) -> Int, funToPrint : (Int) -> Unit){
    println("All natural numbers from 1 to $n : ")
    funToPrint(n)
    println("Sum of all natural numbers from 1 to $n is ${funToAdd(n)}")
}

// 2. Functions as Return Types
fun returnAFunThatPrintsHelloNTimes(n : Int) : (String) -> Unit {
    // Returning a lambda
    return { for(i in 0 until n) println(it) }
}
/** ------------------------------------------------------------ **/

fun main(){
    /** Calling/Invoking lambdas and anonymous functions **/
    // 1. Invoking Lambdas
    val returnedInt : Int = stringToInt.invoke("4")
    println("Returned value of \"4\" is $returnedInt")

    // 2. Invoking anonymous functions
    val returnedString : String = intToStringLambda1.invoke(5)
    println("Returned string for 5 is \"$returnedString\"")
    /** ------------------------------------------------------------ **/

    /** -------- Calling Higher Order functions -------- **/
    // 0. Function that returns a function
    val returnedFun = returnAFunThatPrintsHelloNTimes(5)
    returnedFun.invoke("Hello")

    // 1. Calling the function with pre-defined functions
    println("Calling Higher order function")
    printAndAdd(3, sumOfNNaturalNumbers1, printNNaturalNumbers)

    // 2. Calling the function by defining function in the call itself
    println("Calling Higher order function again")
    printAndAdd(3, { it*(it+1)/2 }, {for(i in 1..it) { println(i) } })
    /** ------------------------------------------------------------ **/

}