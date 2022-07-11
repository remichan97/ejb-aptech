/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mirai
 */
@Entity
@Table(name = "sinh_vien")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SinhVien.findAll", query = "SELECT s FROM SinhVien s"),
    @NamedQuery(name = "SinhVien.findByRollNo", query = "SELECT s FROM SinhVien s WHERE s.rollNo = :rollNo"),
    @NamedQuery(name = "SinhVien.findByFullName", query = "SELECT s FROM SinhVien s WHERE s.fullName = :fullName")})
public class SinhVien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "roll_no")
    private String rollNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "full_name")
    private String fullName;
    @JoinColumn(name = "class_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private LopHoc classId;

    public SinhVien() {
    }

    public SinhVien(String rollNo) {
        this.rollNo = rollNo;
    }

    public SinhVien(String rollNo, String fullName) {
        this.rollNo = rollNo;
        this.fullName = fullName;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LopHoc getClassId() {
        return classId;
    }

    public void setClassId(LopHoc classId) {
        this.classId = classId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rollNo != null ? rollNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SinhVien)) {
            return false;
        }
        SinhVien other = (SinhVien) object;
        if ((this.rollNo == null && other.rollNo != null) || (this.rollNo != null && !this.rollNo.equals(other.rollNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.SinhVien[ rollNo=" + rollNo + " ]";
    }
    
}
