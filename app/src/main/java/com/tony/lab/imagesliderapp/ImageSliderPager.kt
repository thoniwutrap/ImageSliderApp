package com.tony.lab.imagesliderapp

import android.content.Context
import android.graphics.Color
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions


class ImageSliderPager(private val context: Context) : PagerAdapter() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)


    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun getCount(): Int {
        return 6
    }


    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val imageLayout = inflater.inflate(R.layout.sliding_image, container, false)

        var imageView = imageLayout!!.findViewById(R.id.imgDisplay) as ImageView


        Glide.with(context)
            .load(getImageAt(position))
            .into(imageView)

        container.addView(imageLayout, 0)

        return imageLayout
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    private fun getImageAt(position: Int): Int {
        return when (position) {
            0 -> R.drawable.cod1
            1 -> R.drawable.cod2
            2 -> R.drawable.cod3
            3 -> R.drawable.cod4
            4 -> R.drawable.cod5
            5 -> R.drawable.cod6
            else -> R.drawable.cod1
        }
    }

}