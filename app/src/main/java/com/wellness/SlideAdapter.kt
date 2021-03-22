package com.wellness

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter

class SlideAdapter(var context: Context) : PagerAdapter() {
    var layoutInflater: LayoutInflater? = null

    // Arrays
    var slide_images = intArrayOf(
            R.drawable.onboarding_1,
            R.drawable.onboarding_2,
            R.drawable.onboarding_3
    )
    var slide_headings = intArrayOf(
            R.string.first_slide_title,
            R.string.second_slide_title,
            R.string.third_slide_title
    )
    var slide_descs = intArrayOf(
            R.string.first_slide_desc,
            R.string.second_slide_desc,
            R.string.third_slide_desc
    )

    override fun getCount(): Int {
        return slide_headings.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as RelativeLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = layoutInflater!!.inflate(R.layout.slide_layout, container, false)
        val slideImageView = view.findViewById<View>(R.id.slide_image) as ImageView
        val slideHeading = view.findViewById<View>(R.id.slide_heading) as TextView
        val slideDescription = view.findViewById<View>(slide_desc) as TextView
        slideImageView.setImageResource(slide_images[position])
        slideHeading.setText(slide_headings[position])
        slideDescription.setText(slide_descs[position])
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as RelativeLayout)
    }

}