import java.math.BigInteger;
import java.util.ArrayList;

fun main() {
    var myArrayList = ArrayList<BigInteger>()
//    println("Enter first number")
//    val A = BigInteger(readLine())
//    println("Enter second number")
//    val B = BigInteger(readLine())
//    val C = A.add(B)
//    println("The sum is : ")
//    println(C)
//    println("Enter 9 numbers ")
    var D: BigInteger
    for(i in 1..9) {
        D = BigInteger(readLine())
        myArrayList.add(D)
    }
    println(myArrayList)
}