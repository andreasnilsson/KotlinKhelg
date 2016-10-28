//import java.awt.Color
//import java.io.Closeable
//import java.io.File
//
//// ===================================================================================================
//// Top level functions
//// ===================================================================================================
//fun logd(msg: String) {
//    System.out.println(msg)
//}
//
//// ===================================================================================================
//// Data class
//// ===================================================================================================
//data class Person(var name: String, val age: Int, var isHealth: Boolean = true)
//
//
//
//// ===================================================================================================
//// Pairs and Triple
//// ===================================================================================================
//
//fun manyElements(elements: List<Pair<String, Int>>) {
//    for (element in elements) {
//        println("first = ${element.first}, second = ${element.second}")
//    }
//}
//
//fun manyElements2(elements: List<Pair<String, Int>>) {
//    for ((name, age) in elements) {
//        println("first = $name, second = $age")
//    }
//}
//
//// Statically typed DSL
//
//
//
//// ===================================================================================================
//// Higher order functions
//// ===================================================================================================
//
//// HOF 1
//fun higherOrder(func: (Int, Int) -> Int) {
//    print(func(2, 4))
//}
//
//
//fun add(a: Int, b: Int) = a + b
//
//fun testHOF() {
//    higherOrder(::add)
//    higherOrder { a, b -> a + b }
//
//    higherOrder { a, b
//        ->
//        a + b
//    }
//}
//
//
//// HOF 2
//
//fun using(obj: Closeable?, action: () -> Unit) {
//    try {
//        action()
//    } finally {
//        obj?.close()
//    }
//}
//
//fun testUsing() {
//    val stream: Closeable? = null
//    using(stream) {
//        // do stuff
//    }
//}
//
//
//
//// ===================================================================================================
////
//// Functional Composition
////
//// ===================================================================================================
//
//// list of paris
//// to = infix function click to show
//val turtles = listOf("leonardo" to Color.BLUE, "Raphael" to Color.RED, "Micheangelo" to Color.ORANGE, "Donatello" to Color.MAGENTA)
//
//fun testTurtles() {
//    turtles.map {
//        it.first.startsWith("l")
//    }.filter {
//        true //etc
//    }.sorted()
//}
//
//// ===================================================================================================
////
//// Combining HOF with extension functions
////
//// ===================================================================================================
//class RouteHandler(val request: Request, val response: Response)
//
//class Request(val statusCode: Int, val message: String)
//class Response(val contentType: String, val body: String)
//
//
//fun route(path: String, handler: RouteHandler.() -> Unit) {
//
//}
//
//
//fun testRoute() {
//
//    route("/", {
//        println("request.message = ${request.message}")
//    })
//
//
//    route("/") {
//        println("request.message = ${request.message}")
//    }
//
//
//    val file = File("test")
//
//
//    file.let {
//        if (it.isFile) {
//        }
//    }
//
//    with(file) {
//        if (isFile) {
//        }
//    }
//
//    file.apply { // builder pattern
//        if (isFile) {
//
//        }
//    }
//}
//
//
//// ===================================================================================================
////
//// Sequences i.e. streams, lazy eval
////
//// ===================================================================================================
//
//fun testSeq() {
//    val seq = 1..42
//
//    seq.asSequence().filter { it % 2 == 0 }
//
//    generateSequence {
//        1..42
//    }
//}
//
//// ===================================================================================================
////
//// Algebraic data types
////
//// ===================================================================================================
//
//
//sealed class Result() {
//    class Success() : Result()
//    class Error(val statusCode: Int) : Result()
//}
//
//
//fun onResult(result: Result) {
//    when (result) {
//        is Result.Success -> {
//        }
//
//        is Result.Error -> {
//        }
//    }
//}