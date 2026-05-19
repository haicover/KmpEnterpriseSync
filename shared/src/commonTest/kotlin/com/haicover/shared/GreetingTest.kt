
package com.haicover.shared

import kotlin.test.Test
import kotlin.test.assertTrue

class GreetingTest {
    @Test
    fun testGreetingContainsPlatform() {
        val greeting = Greeting().greet()
        assertTrue(greeting.contains("Xin chào"), "Test kiểm tra câu chào có thân thiện không")
    }
}
        