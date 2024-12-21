package com.example.doandidong1.activities

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.doandidong1.R
import com.example.doandidong1.adapter.BannerAdapter
import com.example.doandidong1.efects.DepthPageTransformer

class HomeActivity : AppCompatActivity() {
    private lateinit var bannerViewPager: ViewPager2
    private val handler = Handler(Looper.getMainLooper())
    private val bannerImages = listOf(
        R.drawable.banner1,
        R.drawable.banner2,
        R.drawable.banner3,
        R.drawable.banner4
    ) // Danh sách ảnh banner

    // Các dấu chấm dưới banner
    private lateinit var dot1: ImageView
    private lateinit var dot2: ImageView
    private lateinit var dot3: ImageView
    private lateinit var dot4: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_layout) // Đảm bảo layout có ViewPager2 với id là bannerViewPager

        bannerViewPager = findViewById(R.id.bannerViewPager)
        dot1 = findViewById(R.id.dot1)
        dot2 = findViewById(R.id.dot2)
        dot3 = findViewById(R.id.dot3)
        dot4 = findViewById(R.id.dot4)

        bannerViewPager.adapter = BannerAdapter(bannerImages)
        bannerViewPager.offscreenPageLimit = bannerImages.size // Đảm bảo load đủ các trang
        bannerViewPager.setCurrentItem(0, false) // Bắt đầu ở trang đầu tiên

        // Đặt hiệu ứng chuyển trang
        bannerViewPager.setPageTransformer(DepthPageTransformer())

        // Lắng nghe sự kiện khi thay đổi trang
        bannerViewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                updateDots(position) // Cập nhật dấu chấm khi thay đổi trang
            }
        })
        startAutoScroll()
    }

    private fun updateDots(position: Int) {
        // Đặt tất cả dấu chấm thành màu trắng
        dot1.setImageResource(R.drawable.bo_tron_trang)
        dot2.setImageResource(R.drawable.bo_tron_trang)
        dot3.setImageResource(R.drawable.bo_tron_trang)
        dot4.setImageResource(R.drawable.bo_tron_trang)

        // Tô đậm dấu chấm tương ứng với trang hiện tại
        when (position) {
            0 -> dot1.setImageResource(R.drawable.bo_tron_trang_sang) // Đặt dấu chấm thứ 1 là màu sáng
            1 -> dot2.setImageResource(R.drawable.bo_tron_trang_sang)
            2 -> dot3.setImageResource(R.drawable.bo_tron_trang_sang)
            3 -> dot4.setImageResource(R.drawable.bo_tron_trang_sang)
        }
    }

    private fun startAutoScroll() {
        val runnable = object : Runnable {
            override fun run() {
                val currentPage = bannerViewPager.currentItem
                // Nếu đã đến trang cuối cùng, quay lại trang đầu tiên
                if (currentPage == bannerImages.size - 1) {
                    bannerViewPager.setCurrentItem(0, true) // Quay lại trang đầu tiên
                } else {
                    // Tiến đến trang tiếp theo
                    val nextPage = currentPage + 1
                    bannerViewPager.setCurrentItem(nextPage, true) // Chuyển trang mượt mà
                }
                // Cập nhật dấu chấm sau khi chuyển trang
                updateDots(bannerViewPager.currentItem)
                handler.postDelayed(this, 4000) // Tiếp tục tự động chuyển sau 4 giây
            }
        }
        handler.post(runnable)
    }









    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacksAndMessages(null) // Hủy callback khi activity bị destroy để tránh leak memory
    }
}
