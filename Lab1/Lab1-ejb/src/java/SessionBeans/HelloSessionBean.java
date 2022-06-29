/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package SessionBeans;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;

/**
 *
 * @author Mirai
 */
@Stateless
@LocalBean
public class HelloSessionBean {
    public String say(String name) {
        return "Hello " + name;
    }
    
    public String cong(int a, int b) {
        return a + " + " + b + " = " + (a + b);
    }
}
