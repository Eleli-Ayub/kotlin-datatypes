fun RangesArrays(){
//    ranges using numbers
//    using rangeTo keyword
    for (num in 1.rangeTo(10)){
        println(num)
    }

//    using .. operator
    for (num in 1..10){
        println(num)
    }

//    using downto keyword
    for (num in 10.downTo(1)){
        println(num)
    }

//    String ranges
    for (str in 'a'..'z'){
        println(str)
    }

//    using rangeTo
    for (str in 'a'.rangeTo('z')){
        println(str)
    }

//    using downTo
    for (str in 'z'.downTo('a')){
        println(str)
    }

//    setting intervals in range
//    the value passed after the step keyword is the ammount of spaces that will be skipped in range
    for (str in 'a'.rangeTo('z') step 2){
        println(str)
    }

//    reversing a range
    for (str in 'a'.rangeTo('z').reversed()){
        println(str)
    }

//    using until keyword
//    this one prints values in the range from the first element up to the value less the second value passed
    for (num in 1 until 10){
        println("Inside the until block ${num.toString()}")
    }

//    how to find the first, last or interval of a range
    println("The first element is  " + (1..10).first)
    println("The last element is  " +(1..10).last)
    println("The interal of the array is  " + (1..10 step 5).step)

//    how to filter a range
    val arrayone = 1..10
    val arraytwo = arrayone.filter { x -> x % 2 == 0 }
    println("filtered array $arraytwo")

//    get unique elements in an array
    val names = listOf("Eleli", "Ayub", "Eleli", "Ayub", "cxy", "source", "cxy" )
    println(names.distinct())

//    get min, max, sum, average, count
    val nums = 1..10
//    prints the size of range
    println("the size of the array id ${nums.count()}")
//    prints the maximum value in the range
    println("the maximum value is ${nums.max()}")
//    prints the minimum value in the range
    println("the minimum value is ${nums.min()}")
//    prints the mean in the range
    println("the average is ${nums.average()}")
//    prints the sum value in the range
    println("the sum id ${nums.sum()}")
}