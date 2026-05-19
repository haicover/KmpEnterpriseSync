
package com.haicover.shared

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
        