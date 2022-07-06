/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Intercept;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 *
 * @author Mirai
 */
public class SinhVienInterceptor {
    @AroundInvoke
    public Object interceptMe(InvocationContext ic) throws Exception {
        System.out.println("Before");
        Object o = ic.proceed();
        System.out.println("After");
        
        return o;
    }
}
