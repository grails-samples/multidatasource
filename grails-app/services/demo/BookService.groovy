package demo

class BookService {

    Book saveBook(String name) {
        Book.withTransaction {
            Book book = new Book(title: name)
            book.save()
            book
        }
    }

    List<Book> findAll() {
        Book.withTransaction(readOnly: true) {
            Book.where { }.list() as List<Book>
        }

    }
}