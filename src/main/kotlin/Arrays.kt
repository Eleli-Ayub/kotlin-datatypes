fun StringArray(){
    val countries = arrayOf<String>("Kenya", "India","USA", "Japan")

//    how to print a specific element
    println(countries[2])

//    how to use getter to get specific element
    println(countries.get(3))

//    user setter to set values in the array
//    Note yo cannot inside a value at an index larger than the size of the array
    countries.set(2, "China") //  The first argument is the index to set and the second is the value to set
    println(countries.get(2))

//    Length of the array
    println(countries.size)

//    loop over an array
    for (country in countries){
        println(country)
    }

//    Check if an element exist in an array
//    the "in" keyword which means Kenya and kenya are not the same
    if ("Kenya" in countries){
        println("Kenya is present in the array")
    }else{
        println("Kenya is not present in the array")
    }

//    deleting first or last elements in an array
//    the drop takes a number value of how many elements it should delete at first
    val newDropCountries = countries.drop(1)
    println(newDropCountries)
//  deletes the last elements
    val newDroplastCountries = countries.dropLast(1)
    println(newDroplastCountries)

//    check if array is empty
    println(countries.isEmpty())

    val deleteAllCountries = countries.drop(5)
    println(deleteAllCountries.isEmpty())

//    add element to a specific point in an array
    val mutableList = mutableListOf(1,2,6,4,7,99,33,44,3,6,56)
//    user add() function to add elements to the array. The first argument is the position the second one is the value
    mutableList.add(5,32)
    println(mutableList)
}