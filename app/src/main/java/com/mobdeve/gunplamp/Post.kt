package com.mobdeve.gunplamp

import android.net.Uri
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class Post(poster: User, imagePost: String?, caption: String?, store: Store, date: String, isLiked: Boolean) {
    val username: String = poster.username
    val profilePic: Int = poster.profilePic

    val imagePost: String? = imagePost
    var caption: String? = caption
    val datePosted: String = date
    val store: Store = store

    var liked: Boolean = isLiked
    var likes: ArrayList<User>? = null
    var comments: ArrayList<Comment>? = null

    fun changeCaption(newCap: String) {
        caption = newCap
    }

}