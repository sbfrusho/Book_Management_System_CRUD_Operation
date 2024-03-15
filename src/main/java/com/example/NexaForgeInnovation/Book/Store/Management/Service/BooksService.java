package com.example.NexaForgeInnovation.Book.Store.Management.Service;

import com.example.NexaForgeInnovation.Book.Store.Management.Entity.Books;
import com.example.NexaForgeInnovation.Book.Store.Management.Repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Component
public class BooksService {

    //This is the service class for the books table
    //It contains the methods to show all books, add a book, update a book, delete a book, get a book by id
    //It uses the books repository to perform the CRUD operations

    @Autowired
    private BooksRepository booksRepository;
    public List<Books> showBooks(){//A method to show all books
        return booksRepository.findAll();
    }

    public Books addBook(Books book){//A method to add a book
        return booksRepository.save(book);
    }

    public Books updateBook(Books book){//A method to update a book
        return booksRepository.save(book);
    }

    public void deleteBook(long id){//A method to delete a book by id
        booksRepository.deleteById(id);
    }

    public Books getBook(long id){//A method to get a book by id
        return booksRepository.findById(id).get();
    }
}
