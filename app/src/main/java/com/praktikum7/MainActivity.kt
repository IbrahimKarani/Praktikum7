package com.praktikum7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //mengatur view pager adapter
        view_pager.adapter = ViewPagerAdapter(
            this, supportFragmentManager)
        //mengatur tab dengan view pager
        tabs.setupWithViewPager(view_pager)
    }
}