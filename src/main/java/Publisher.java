import jakarta.persistence.*;

import java.sql.Date;


import java.util.List;

@Entity
@Table(name = "publishers")
public class Publisher {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id")
    private int id;


    @Column(name = "publisher_name",nullable = false)
    private String name;

    @Column(name = "publisher_establishment_year",nullable = false)
    private Date establishmentYear;


    @Column(name = "publisher_address",nullable = false)
    private String address;

    @OneToMany(mappedBy = "publisher",cascade = CascadeType.ALL)
    private List<Book> bookList;

    public Publisher(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEstablishmentYear() {
        return establishmentYear;
    }

    public void setEstablishmentYear(Date establishmentYear) {
        this.establishmentYear = establishmentYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", establishmentYear=" + establishmentYear +
                ", address='" + address + '\'' +
                '}';
    }
}

