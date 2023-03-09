fun main(args: Array<String>) {
val ages= arrayOf(22,4,22,90,35,35,37)
    county()

var them=calculator(34,4,26,36)
}
//fun food(fd1:String, fd2:String):String{}

//2.Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
class numb(minAge:Int, maxAge:Int, Avg:Int,)
    fun all(numb: Array<Int>):Ages{
        var large = numb.max()
        var small = numb.min()
        var avg = numb.average()
        val al=Ages(large,small,avg)
        return al
    }
//3. Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.
fun space(){
    var state="Mombasa"
  state.forEach { w in state.split("Mombasa") }
}

//4. Write and call a function that takes in an array of strings, joins them all into
//one string and returns it. (4 marks)
fun county():String{
    var cities= arrayOf("Nairobi", "Mombasa", "Kisumu")
  var add=$cities[0]" "$cities[1]" "$cities[2]"
    println(add.contentToString)
}
//Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions
class calculator(addition:Int, subtraction:Int, division:Int, multiply:Int){
    fun allAdd(){
       var x=20
        var y=2
        val addition=x+y
        val subtraction=x-y
        val division=x/y
        val multiply=x*y
        println(addition)
        println(subtraction)
        println(division)
        println(multiply)
    }
}
