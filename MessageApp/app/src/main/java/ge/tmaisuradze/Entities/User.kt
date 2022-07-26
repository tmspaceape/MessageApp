package ge.tmaisuradze.Entities

import com.google.firebase.database.IgnoreExtraProperties
import java.io.Serializable

@IgnoreExtraProperties
data class User(
    var id: String? = null,
    val username: String? = null,
    val profession: String? = null,
    val avatar: String? = null
) : Serializable