
open class Person(
    val name:String,
    var age:Int
    ){
//    open var nam:String=readLine().toString()
//    open var ag:Int=Integer.valueOf(readLine())
    val fullName: String
        get() = name
     constructor(year :Int, name:String, age:Int) : this(name, age) {
         this.age += year
     }
    open val id : String = "Larry Page"
//    init{
//        println("Enter name")
//        name = readLine().toString()
//        println("Enter age")
//        age = readLine()!!.toInt()
//        id = "$name $age"
//        println(id)
//    }
}
//class Employee(val company: String, val person: Person): Person by person {
//}

class Employee(company: String) : Person("c",4) {
    override val id = "$name $company $age"
}
