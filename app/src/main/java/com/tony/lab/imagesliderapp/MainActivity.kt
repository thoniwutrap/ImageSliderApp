package com.tony.lab.imagesliderapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var yourAdapter: PagerAdapter? = null
    var endlessPagerAdapter : EndlessPagerAdapter? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        yourAdapter = ImageSliderPager(this)

        endlessPagerAdapter = EndlessPagerAdapter(yourAdapter, imageSlider)
        imageSlider.adapter = endlessPagerAdapter;
        imageSlider.currentItem = 1
    }
}
