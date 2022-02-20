data class Message(
    val text: String,
    val timestamp: Long
){
    override fun toString(): String {
        return "Message( $text, $timestamp)"
    }
}
