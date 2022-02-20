import java.lang.StringBuilder
import kotlin.random.Random

fun main() {
    val testList = getRandomList()

    val res = testList.joinToString(". ") { it.toString() }
    println(res)

    val filtered = testList.filter { value ->
        value % 2 == 0
    }
    println(filtered)

    val transformed = testList.map { value ->
        value % 2 == 0
    }
    println(transformed)

    val sortedAsc = testList.sorted()
    println(sortedAsc)
    println(testList)

    val sortedDesc = testList.sortedDescending()
    println(sortedDesc)

    val subList = testList.subList(0, 5)
    println(subList)

    testList.forEach { print("$it ") }
    println()
    val mutableList = testList.toMutableList()
    mutableList.add(2000)
    println(mutableList)
    println(testList)
}


fun getRandomList(): List<Int>{
    val numbers: MutableList<Int> = mutableListOf(1, 34, 56)
    for (i in 0..20){
        numbers.add(Random.nextInt(100))
    }
    return numbers
}