package com.example.NexaForgeInnovation.Book.Store.Management.Controller;

import com.example.NexaForgeInnovation.Book.Store.Management.Entity.Books;
import com.example.NexaForgeInnovation.Book.Store.Management.Service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/books")
public class BookController {

    //This is the controller class for the books table
    //It contains the methods to show all books, add a book, update a book, delete a book, get a book by id
    //It uses the books service to perform the CRUD operations

    @Autowired
    private BooksService booksService;
    @GetMapping("/books")
    public List<Books> showBooks(){//A method to show all books
        Books books = new Books();
        return booksService.showBooks();
    }

    @PostMapping("/books/add")
    public ResponseEntity addBook(@RequestBody Books book){//A method to add a book
        booksService.addBook(book);
        return new ResponseEntity("Book added successfully", HttpStatus.ACCEPTED);
    }

    @PutMapping("/books/update")
    public ResponseEntity updateBook(@RequestBody Books book){//A method to update a book
        booksService.updateBook(book);
        return new ResponseEntity("Book updated successfully", HttpStatus.ACCEPTED);
    }
//
    @GetMapping("/books/{id}")
    public ResponseEntity getBook(@PathVariable long id){//A method to get a book by id
        booksService.getBook(id);
        return new ResponseEntity("Book found successfully", HttpStatus.ACCEPTED);
    }
//Book_Management_System_CRUD_Operation
    @DeleteMapping("/books/delete/{id}")
    public ResponseEntity deleteBook(@PathVariable long id){//A method to delete a book by id
        booksService.deleteBook(id);
        return new ResponseEntity("Book deleted successfully", HttpStatus.ACCEPTED);
    }

}
