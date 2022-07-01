/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package Beans;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import model.SinhVien;

/**
 *
 * @author Mirai
 */
@Stateless
@LocalBean
public class SinhVienBean {
    
    private EntityManager em;

    public SinhVienBean() throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        DriverManager.getConnection("jdbc:mysql://localhost:3306/lab2?autoReconnect=true&useSSL=false", "mirai", "remichan");
        em = Persistence.createEntityManagerFactory("JavaApplication1PU").createEntityManager();
    }
    
    public List<SinhVien> findAll() {
        return em.createQuery("select sv from model.SinhVien sv").getResultList();
    }
    
}
