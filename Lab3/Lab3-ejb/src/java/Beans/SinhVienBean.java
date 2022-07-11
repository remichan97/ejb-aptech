/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package Beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import models.SinhVien;

/**
 *
 * @author Mirai
 */
@Stateless
@LocalBean
public class SinhVienBean {
    private EntityManager em;
    
    @PostConstruct
    private void init() {
        em = Persistence.createEntityManagerFactory("Lab3-ejbPU").createEntityManager();
    }
    
    public List<SinhVien> findAll() {
        return em.createQuery("select sv from models.SinhVien sv").getResultList();
    }
    
    public SinhVien findByRoll(String roll) {
        return em.find(SinhVien.class, roll);
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
