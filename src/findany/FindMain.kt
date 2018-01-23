package findany

fun main(args: Array<String>) {
    println("hi")

    listOf(3, 2, 6, 4, 2)
            .stream().findAny().get().run { println(this) }
    emptyList<Int>()
            .stream().findAny().get().run { println(this) }

    listOf(3, 2, 6, 4, 2)
            .reduce { i1, i2 -> i1 + i2 }
            .run { println(this) }
}