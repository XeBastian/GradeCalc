//grade calculator
fun main() {
    var x = calculateGrade()
    println(x)
}

//grade calculator brain
fun calculateGrade() {
    var subjects = mutableListOf<Double>()
//    we get of type int because we want to be calculating. Future update would be to use class and use Subject Class
    println("*************************GRADE CALCULATOR*************************")
    println("Welcome to the GRADE CALCULATOR")
    println("1. How many subjects are you taking now? :: ")
    val numOfSubjects: Int = readln().toInt()
    println("Great! now we will need you to enter the grades of all the subjects.")
    for (i: Int in numOfSubjects downTo 1) {
//        print("${subjects.indexOf(it)}")
        val x = readln().toDouble()
        subjects.add(x)
    }
//    calculate the grades here
    calculateItems(subjects)

}

fun calculateItems(items: MutableList<Double>) {
    var sum = 0.0
    items.forEach { it ->
        sum += it
    }

    println("Here is a very good breakdown of the percentage of each of the subjects")
    items.forEach {
//        calculate percentage
        println("$it represents ${String.format("%.2f", (it / (sum)) * 100)}%")
    }
    giveGradeMeaning(sum / items.size)
//    choose the largest percentage and the smallest percentage
//    items.forEach{
//
//    }
}

fun giveGradeMeaning(grade: Double) {
    println("Your current grade is ${String.format("%.2f", grade)}")

    when (grade) {
        in 0.0..35.0 -> println("Fail")
        in 35.0..49.9 -> println("AVERAGE")
        in 50.0..69.9 -> println("PASSED -- YOU CAN DO BETTER")
        in 70.0..89.9 -> println("GOOD -- KEEP IT UP")
        in 90.0..100.0 -> println("EXCELLENT -- YOU NAILED IT")
    }
}