package com.example.springlearn

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MVCController(private val repo: BookRepository) {
    @GetMapping("/")
    fun home(): String {
        repo.save(Book("T", 12))
        val x = repo.findByPages(12)
        println(x)
        return "index"
    }
}