/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Mirai
 */
@Entity
@Table(name = "t_sach")
@NamedQueries({
    @NamedQuery(name = "Sach.findAll", query = "SELECT s FROM Sach s"),
    @NamedQuery(name = "Sach.findByIsbn", query = "SELECT s FROM Sach s WHERE s.isbn = :isbn"),
    @NamedQuery(name = "Sach.findByBookName", query = "SELECT s FROM Sach s WHERE s.bookName = :bookName"),
    @NamedQuery(name = "Sach.findByAuthor", query = "SELECT s FROM Sach s WHERE s.author = :author"),
    @NamedQuery(name = "Sach.findByPrice", query = "SELECT s FROM Sach s WHERE s.price = :price"),
    @NamedQuery(name = "Sach.findByDescription", query = "SELECT s FROM Sach s WHERE s.description = :description")})
public class Sach implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "bookName")
    private String bookName;
    @Column(name = "author")
    private String author;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Float price;
    @Column(name = "description")
    private String description;
    @JoinColumn(name = "danh_muc_id", referencedColumnName = "id")
    @ManyToOne
    private DanhMuc danhMucId;

    public Sach() {
    }

    public Sach(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DanhMuc getDanhMucId() {
        return danhMucId;
    }

    public void setDanhMucId(DanhMuc danhMucId) {
        this.danhMucId = danhMucId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sach)) {
            return false;
        }
        Sach other = (Sach) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Sach[ isbn=" + isbn + " ]";
    }
    
}
