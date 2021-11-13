package com.example.springlearn

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager

@DataJpaTest
class RepositoriesTests @Autowired constructor(
    val entityManager: TestEntityManager,
    val bookRepository: BookRepository,) {

    @Test
    fun insertRecord() {
        val article = Book("Spring Framework 5.0 goes GA", 12)
        entityManager.persist(article)
        val article1 = Book("Test Book", 30)
        entityManager.persist(article1)
        entityManager.flush()
        val found = bookRepository.findByPages(12)
        assertThat(found).isEqualTo(article)
    }
}