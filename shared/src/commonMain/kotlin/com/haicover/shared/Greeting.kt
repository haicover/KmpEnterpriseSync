
package com.haicover.shared

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Xin chào từ ${platform.name}! 🚀 Đây là Mobile Enterprise App chạy Kotlin Multiplatform tự động hoàn toàn."
    }
}
        