import java.util.stream.Stream

fun main(args: Array<String>) {
    println("hello kotlin")

    val intRange: IntRange = 1..100
    intRange.flatMap { it -> listOf(it, it+1, it+2) }
            .forEach(::println)

    println("hello world")

    val helloworld = listOf("hello", "world")
    helloworld.flatMap { it -> it.split("") }
            .count()
            .run { println(this) }
    "hello".split("").count().run { println(this) }
}