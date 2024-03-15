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

    @Autowired
    private BooksService booksService;
    @GetMapping("/books")
    public List<Books> showBooks(){
        Books books = new Books();
        return booksService.showBooks();
    }

    @PostMapping("/books/add")
    public ResponseEntity addBook(@RequestBody Books book){
        booksService.addBook(book);
        return new ResponseEntity("Book added successfully", HttpStatus.ACCEPTED);
    }

    @PutMapping("/books/update")
    public ResponseEntity updateBook(@RequestBody Books book){
        booksService.updateBook(book);
        return new ResponseEntity("Book updated successfully", HttpStatus.ACCEPTED);
    }
//
    @GetMapping("/books/{id}")
    public ResponseEntity getBook(@PathVariable long id){
        booksService.getBook(id);
        return new ResponseEntity("Book found successfully", HttpStatus.ACCEPTED);
    }
//
    @DeleteMapping("/books/delete/{id}")
    public ResponseEntity deleteBook(@PathVariable long id){
        booksService.deleteBook(id);
        return new ResponseEntity("Book deleted successfully", HttpStatus.ACCEPTED);
    }

}
