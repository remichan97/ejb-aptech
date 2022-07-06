/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package Beans;

import java.sql.SQLException;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import model.SinhVien;

/**
 *
 * @author Mirai
 */
@Stateless
@LocalBean
@Interceptors(value = {Intercept.SinhVienInterceptor.class})
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

    public void addNew(SinhVien sv) {
        em.getTransaction().begin();

        em.persist(sv);

        em.getTransaction().commit();
    }
    
    public SinhVien getUpdateInfo(String rollNo) {
        return em.find(SinhVien.class, rollNo);
    }

    public void update(SinhVien sv) {
        em.getTransaction().begin();

        em.merge(sv);

        em.getTransaction().commit();
    }

    public void delete(String rollNo) {
        em.getTransaction().begin();

        SinhVien sv = em.find(SinhVien.class, rollNo);
        
        em.remove(sv);
        
        em.getTransaction().commit();
    }
}
