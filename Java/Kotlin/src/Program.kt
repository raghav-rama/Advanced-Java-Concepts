class Program {
    fun addTwoNumbers(a: Int, b: Int, action: MyInterface) {
        val sum = a+b
        action.execute(sum)
//        println(sum)
    }
    val myLambda: (Int) -> Unit = { s -> println(s)}
    fun addTwoNumbers(a : Int, b : Int, myLambda: (Int) -> Unit) {
        val sum = a+b
        myLambda(sum)
    }
}
interface MyInterface {
    fun execute(sum:Int)
}