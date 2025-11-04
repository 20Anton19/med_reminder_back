package com.example.med_reminder_back

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
@RequestMapping("/api/test")
class TestController {
    data class TestResponse(val message: String, val time: String)

    @GetMapping
    fun test(): TestResponse {
        return TestResponse("Бэкенд работает!", LocalDateTime.now().toString())
    }
}