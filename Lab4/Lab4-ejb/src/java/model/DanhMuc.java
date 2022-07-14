/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Mirai
 */
@Entity
@Table(name = "t_danhmuc")
@NamedQueries({
    @NamedQuery(name = "DanhMuc.findAll", query = "SELECT d FROM DanhMuc d"),
    @NamedQuery(name = "DanhMuc.findById", query = "SELECT d FROM DanhMuc d WHERE d.id = :id"),
    @NamedQuery(name = "DanhMuc.findByName", query = "SELECT d FROM DanhMuc d WHERE d.name = :name")})
public class DanhMuc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "danhMucId")
    private Collection<Sach> sachCollection;

    public DanhMuc() {
    }

    public DanhMuc(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Sach> getSachCollection() {
        return sachCollection;
    }

    public void setSachCollection(Collection<Sach> sachCollection) {
        this.sachCollection = sachCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DanhMuc)) {
            return false;
        }
        DanhMuc other = (DanhMuc) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.DanhMuc[ id=" + id + " ]";
    }
    
}
