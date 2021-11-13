package com.example.springlearn

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "AllBooks")
class Book(
    var title: String,
    var pages: Int,
    @Id @GeneratedValue var id: Long? = null
){
    override fun toString(): String {
        return "Book(title='$title', pages=$pages, id=$id)"
    }
}