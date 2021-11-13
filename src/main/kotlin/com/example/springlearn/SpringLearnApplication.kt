package com.example.springlearn

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringLearnApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringLearnApplication::class.java, *args)
}