/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import model.DanhMuc;
import model.Sach;

/**
 *
 * @author Mirai
 */
@Stateless
@LocalBean
public class SachBean {
    
    private EntityManager em;
    
    @PostConstruct
    private void init() {
        em = Persistence.createEntityManagerFactory("JavaApplication2PU").createEntityManager();
    }
    
    public List<Sach> findAll() {
        return em.createQuery("select sv from model.Sach sv").getResultList();
    }
    
    public List<DanhMuc> findAllDanhMuc() {
        return em.createQuery("select sv from model.DanhMuc sv").getResultList();
    }
    
    public DanhMuc findDanhMuc(String id) {
        return em.find(DanhMuc.class, id);
    }
    
    public Sach findByBn(String isbn) {
        return em.find(Sach.class, isbn);
    }
 
    public void addNew(Sach sv) {
        em.getTransaction().begin();

        em.persist(sv);

        em.getTransaction().commit();
    }
    
    public Sach getUpdateInfo(String rollNo) {
        return em.find(Sach.class, rollNo);
    }

    public void update(Sach sv) {
        em.getTransaction().begin();

        em.merge(sv);

        em.getTransaction().commit();
    }

    public void delete(String rollNo) {
        em.getTransaction().begin();

        Sach sv = em.find(Sach.class, rollNo);
        
        em.remove(sv);
        
        em.getTransaction().commit();
    }
}
