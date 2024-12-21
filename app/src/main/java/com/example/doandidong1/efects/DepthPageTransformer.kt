package com.example.doandidong1.efects

import android.view.View
import androidx.viewpager2.widget.ViewPager2
import kotlin.math.abs

class DepthPageTransformer : ViewPager2.PageTransformer {
    override fun transformPage(view: View, position: Float) {
        val pageWidth = view.width
        val pageHeight = view.height

        when {
            position < -1 -> { // [-Infinity,-1)
                // Trang này nằm ngoài cùng bên trái. Ẩn hoàn toàn.
                view.alpha = 0f
            }
            position <= 0 -> { // [-1,0]
                // Trang hiện tại. Mờ dần, thu nhỏ và nhấn xuống.
                view.alpha = 1 + position // Mờ dần khi position tiến về -1
                view.scaleX = 1 - abs(position) / 7f // Thu nhỏ nhẹ hơn
                view.scaleY = 1 - abs(position) / 7f
                view.translationY = -pageHeight * position / 15f // Nhấn nhẹ hơn
            }
            position <= 1 -> { // (0,1]
                // Trang bên cạnh. Mờ dần, thu nhỏ và nhấn xuống.
                view.alpha = 1 - position // Mờ dần khi position tiến về 1
                view.scaleX = 1 - abs(position) / 7f // Thu nhỏ nhẹ hơn
                view.scaleY = 1 - abs(position) / 7f
                view.translationY = pageHeight * position / 15f // Nhấn nhẹ hơn
            }
            else -> { // (1,+Infinity]
                // Trang này nằm ngoài cùng bên phải. Ẩn hoàn toàn.
                view.alpha = 0f
            }
        }
    }
}
