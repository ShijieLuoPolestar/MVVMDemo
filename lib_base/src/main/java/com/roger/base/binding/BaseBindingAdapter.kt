package com.roger.base.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.blankj.utilcode.util.Utils
import com.bumptech.glide.Glide


@BindingAdapter("loadImage")
fun loadImage(imageView:ImageView,imageUrl:String?){
    if (imageUrl.isNullOrBlank()) return
    Glide.with(Utils.getApp()).load(imageUrl).into(imageView)
}