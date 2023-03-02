package com.mobdeve.gunplamp

import android.view.View
import android.view.View.OnClickListener
import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.gunplamp.databinding.ItemLayoutBinding

class MyViewHolder(private val viewBinding: ItemLayoutBinding): RecyclerView.ViewHolder(viewBinding.root) {

    fun bindData(post: Post) {
        this.viewBinding.ivUserIcon.setImageResource(post.userImageId)
        this.viewBinding.tvUsername.text = post.username
        this.viewBinding.tvLocation.text = post.location

        this.viewBinding.ivImagePosted.setImageResource((post.imageId))

        //How will we track every user's activity with likes (Solution: add or check if user
        // is in list/array of strings?

        //
        this.viewBinding.ibFavorite.setImageResource(isLikedDrawable(post.liked))
    }

    fun setLikeOnClickListener(onClickListener: View.OnClickListener) {
        this.viewBinding.ibFavorite.setOnClickListener(onClickListener)
    }

    fun isLikedDrawable(like: Boolean): Int {

        if (like) {
            return R.drawable.liked_36
        }

        return R.drawable.unliked_36
    }

    fun changeLike(post: Post) {
        post.liked = !(post.liked)
    }


    //Suggestion
    fun userInLikeList(post: Post, user: User): Boolean {

        return (post.likeCounter).contains(user.username)
    }


}