import java.awt.Color
import java.io.Closeable
import java.io.File

// ===================================================================================================\
//
// Top level functions
// note: log
// ===================================================================================================


// ===================================================================================================
//
// Data class
// note: person, name, age, isHealthy
// ===================================================================================================

// ===================================================================================================
// Pairs and Triple
// note: many pair elements, print first second
// tuple
// ===================================================================================================

fun manyElements(elements: List<Pair<String, Int>>) {
}

fun manyElementsAgain(elements: List<Pair<String, Int>>) {
}


// ===================================================================================================
//
// Higher order functions
//
// note: (int, int) -> int
// ===================================================================================================

// function taking function as argument note: (int, int) -> int

// expression as a function (add)

// use together
fun testHOF() {

}

// HOF 2
// using closeable, action () -> Unit

// test it


// ===================================================================================================
//
// Functional Composition
//
// ===================================================================================================

// list of paris
// to = infix function click to show
val turtles = listOf("leonardo" to Color.BLUE, "Raphael" to Color.RED, "Micheangelo" to Color.ORANGE, "Donatello" to Color.MAGENTA)

fun testTurtles() {
    turtles.map {
        it.first.startsWith("l")
    }.filter {
        true //etc
    }.sorted()
}

// ===================================================================================================
//
// Combining HOF with extension functions
//
// ===================================================================================================
class RouteHandler(val request: Request, val response: Response)
class Request(val statusCode: Int, val message: String)
class Response(val contentType: String, val body: String)

fun route(path: String, handler: RouteHandler.() -> Unit) { }


fun testRoute() {

    route("/orders", {
        println("request.message = ${request.message}")
    })


    route("/tomtar") {
        println("request.message = ${request.message}")
    }

    val file = File("test")

//    Nifty built in functions

    // let
    file.let {
        if (it.isFile) {
        }
    }

    // with
    with(file) {
        if (isFile) {
        }
    }

    // apply
    file.apply { // builder pattern
        if (isFile) {

        }
    }
}


// ===================================================================================================
//
// Sequences i.e. streams, lazy eval
//
// ===================================================================================================

fun testSeq() {
    val seq = 1..42

    seq.asSequence().filter { it % 2 == 0 }

    generateSequence {
        1..42
    }
}

// ===================================================================================================
//
// Algebraic data types
//
// ===================================================================================================


sealed class Result() {
    class Success() : Result()
    class Error(val statusCode: Int) : Result()
}


fun onResult(result: Result) {
    when (result) {
        is Result.Success -> {
        }

        is Result.Error -> {
        }
    }
}