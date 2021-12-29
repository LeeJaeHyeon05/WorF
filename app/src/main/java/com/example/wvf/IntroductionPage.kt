package com.example.wvf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class IntroductionPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduction_page)

        //뷰페이저 2 코드
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        viewPager.adapter = ViewPagerAdapter(getList())
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
    }
    //뷰페이저2 코드
    private fun getList(): ArrayList<Int> {
        return arrayListOf<Int>(R.drawable.intro1, R.drawable.intro2, R.drawable.intro3)
    }
}