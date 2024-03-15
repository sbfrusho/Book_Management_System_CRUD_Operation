package com.example.NexaForgeInnovation.Book.Store.Management.Entity;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "books")
public class Books {
    //This is the entity class for the books table
    //It contains the fields of the books table
    //It also contains the getters and setters for the fields
    //It also contains the toString method
    //Constructors , getters and setters are implemented using lombok
    //The table name is books
    //The fields are id, title, isbn, author, stock, price
    //The id is the primary key
    //The isbn is unique
    //The fields are annotated with the column name

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "isbn", unique = true)
    private long isbn;

    @Column(name = "author")
    private String author;

    @Column(name = "stock")
    private int stock;

    @Column(name = "price")
    private double price;
}
