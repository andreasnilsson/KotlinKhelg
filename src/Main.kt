
fun main() {
    // Top level function
    logd("Kotlin Main")


    // Instantiation
    val p1 = Person("test", 20)
    println("p1 = ${p1}")

    // Instantiation with named variabels
    val p2 = Person(age = 20, name = "testing")
    println("p2 = ${p2}")

    // Instantiation deep copy
    val p1Copy = p1.copy("tomte")
    println("p1Copy = ${p1Copy}")

    // Show comparison and deep equals
    val p1Identical = Person("test", 20)
    println("p1.equals(p1Identical) = ${p1.equals(p1Identical)}")
    println("p1.equals(p1Identical) = ${p1 == p1Identical}")

    // extension function
    println("p1.isHappy() = ${p1.isHappy()}")
    println("p1.isHappy() = ${p1.copy(age = 60).isHappy()}")

    p1.isSad()
}

// simplify
fun Person.isHappy(): Boolean = age < 50
