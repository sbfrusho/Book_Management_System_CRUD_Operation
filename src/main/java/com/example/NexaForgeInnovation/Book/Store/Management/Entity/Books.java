package com.example.NexaForgeInnovation.Book.Store.Management.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "books")
public class Books {
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
