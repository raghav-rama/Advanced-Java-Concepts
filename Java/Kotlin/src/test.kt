import Program

fun main(args: Array<String>){
    val p1 = Program()
    p1.addTwoNumbers(3,5, p1.myLambda)
//    p1.addTwoNumbers(2, 7, object : MyInterface {
//        override fun execute(sum: Int) {
//            println(sum)
//        }
//    })
//    val test: String  = "hello"
//    val myLambda: (Int) -> Unit = { s -> println(s)}
}