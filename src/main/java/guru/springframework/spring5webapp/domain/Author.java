package guru.springframework.spring5webapp.domain;
import javax.persistence.*;
import java.util.*;
@Entity //When using entity it must be accompanied by a primary key for the class
public class Author {
    // Generating primary key for class = PRIVATE LONG ID
    @Id //NEEDED
    @GeneratedValue(strategy = GenerationType.AUTO) //NEEDED
    private Long id; //Must add Getters & Setters
    private String firstName;
    private String lastName;
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;

    // Zero package use for the Author class
    public Author() {
    }

    // Constructor for Author class
    public Author(String firstName, String lastName, Set<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    //Setters and Getters for all private variables
    public String getFirstName() { //GETTER for firstName
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() { //GETTER for lastName
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
