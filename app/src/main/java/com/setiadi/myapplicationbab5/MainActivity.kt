package com.setiadi.myapplicationbab5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.setiadi.myapplicationbab5.databinding.ActivityMainBinding
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {
    private var layout : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var layout = ActivityMainBinding.inflate(layoutInflater)
        setContentView(layout.root)

        val viewPager: ViewPager2 = findViewById(R.id.view_pager)
        val fragment: ArrayList<Fragment> = arrayListOf(
            BlankPage1Fragment(),
            BlankPage2Fragment(),
            BlankPage3Fragment(),
            BlankPage4Fragment(),

            )
        val adapter = ViewPagerAdapter(fragment, this)
        viewPager.adapter = adapter

        val indicator: CircleIndicator3 = findViewById(R.id.indicator)
        indicator.setViewPager(viewPager)

    }
}



