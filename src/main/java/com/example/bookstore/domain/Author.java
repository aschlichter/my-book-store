package com.example.bookstore.domain;


import javax.persistence.*;


@Entity
@Table(name = "author")
@SecondaryTable(name="book")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private Long id;

    private String name;
    private String nation;

    @Column(table = "book")
    private String title;

    @Column(table = "book")
    private String publisher;

    public Author() {
    }

    public Author(String name, String nation, String title, String publisher) {
        this.name = name;
        this.nation = nation;
        this.title = title;
        this.publisher = publisher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
