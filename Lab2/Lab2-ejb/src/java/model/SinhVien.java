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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Mirai
 */
@Entity
@Table(name = "sinh_vien")
@NamedQueries({
    @NamedQuery(name = "SinhVien.findAll", query = "SELECT s FROM SinhVien s"),
    @NamedQuery(name = "SinhVien.findByRollId", query = "SELECT s FROM SinhVien s WHERE s.rollId = :rollId"),
    @NamedQuery(name = "SinhVien.findByFullName", query = "SELECT s FROM SinhVien s WHERE s.fullName = :fullName"),
    @NamedQuery(name = "SinhVien.findByClassName", query = "SELECT s FROM SinhVien s WHERE s.className = :className")})
public class SinhVien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "roll_id")
    private String rollId;
    @Basic(optional = false)
    @Column(name = "full_name")
    private String fullName;
    @Basic(optional = false)
    @Column(name = "class_name")
    private String className;

    public SinhVien() {
    }

    public SinhVien(String rollId) {
        this.rollId = rollId;
    }

    public SinhVien(String rollId, String fullName, String className) {
        this.rollId = rollId;
        this.fullName = fullName;
        this.className = className;
    }

    public String getRollId() {
        return rollId;
    }

    public void setRollId(String rollId) {
        this.rollId = rollId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rollId != null ? rollId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SinhVien)) {
            return false;
        }
        SinhVien other = (SinhVien) object;
        if ((this.rollId == null && other.rollId != null) || (this.rollId != null && !this.rollId.equals(other.rollId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.SinhVien[ rollId=" + rollId + " ]";
    }
    
}
