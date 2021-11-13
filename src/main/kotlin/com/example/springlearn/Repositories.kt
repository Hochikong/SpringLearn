package com.example.springlearn

import org.springframework.data.repository.CrudRepository

interface BookRepository : CrudRepository<Book, Long> {
    fun findByPages(pages: Int): Iterable<Book>
    fun findAllByOrderByIdDesc(): Iterable<Book>
}