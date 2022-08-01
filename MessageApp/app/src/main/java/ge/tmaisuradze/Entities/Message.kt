package ge.tmaisuradze.Entities

import com.google.firebase.database.IgnoreExtraProperties
import java.util.*

@IgnoreExtraProperties
data class Message(
    var id: String? = null,
    val senderId: String? = null,
    val receiverId: String? = null,
    val key: String? = null,
    val time: Date? = null,
    val content: String? = null
) : Comparable<Message> {

    override fun compareTo(other: Message): Int {
        return time!!.compareTo(other.time)
    }

}