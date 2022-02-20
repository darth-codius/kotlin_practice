import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    val testList = mutableListOf<Message>(
        Message("hi everyone", 25000L),
        Message("hi people", 22000L),
        Message("bossman", 1500L),
        Message("oil money", 23000L),
        Message("Baddest Android dev", 28000L),
        Message("I love Akara and Bread", 21000L),
        Message("Sai Baba", 30000L)
    )
    println(testList)

    val sortedAsc = testList.sortedBy { it.timestamp }
    println(sortedAsc)

    val sortedDesc = testList.sortedByDescending { it.timestamp }
    println(sortedDesc)

    val timedMessages =
        testList.map {
            TimedMessage(text = it.text, LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME))
        }
    println(timedMessages)

    timedMessages.forEach {
        println(it)
    }
}

