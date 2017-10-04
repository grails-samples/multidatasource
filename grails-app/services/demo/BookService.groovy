package demo

import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic

@Transactional
@CompileStatic
class BookService {

    Book saveBook(String name) {
        Book book = new Book(title: name)
        book.save()
        book
    }

    List<Book> findAll() {
        Book.where { }.list() as List<Book>
    }
}