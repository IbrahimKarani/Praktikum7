package com.praktikum7

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.praktikum7.FirstFragment
import com.praktikum7.R
import com.praktikum7.SecondFragment

class ViewPagerAdapter(private val mContext: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {
    // memanggil fragment melalui index
    override fun getItem(position: Int): Fragment {
        return if (position == 0) {
            FirstFragment.newInstance()
        }
        else if(position == 1) {
            SecondFragment.newInstance()
        }
        else {
            ThirdFragment()
        }


    }
    //menentukan jumlah tab
    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        //kembali ke halaman judul
        return mContext.resources.getString(TAB_TITLES[position])
    }


    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(R.string.tab_text_1,    R.string.tab_text_2, R.string.tab_text_3)
    }
}