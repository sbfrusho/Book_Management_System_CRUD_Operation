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

    @Autowired
    private BooksRepository booksRepository;
    public List<Books> showBooks(){
        return booksRepository.findAll();
    }

    public Books addBook(Books book){
        return booksRepository.save(book);
    }

    public Books updateBook(Books book){
        return booksRepository.save(book);
    }

    public void deleteBook(long id){
        booksRepository.deleteById(id);
    }

    public Books getBook(long id){
        return booksRepository.findById(id).get();
    }
}
