

package com.example.advancedjava;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdvancedJava {

    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext contex = 
               new ClassPathXmlApplicationContext("applicationContext.xml");
              
        ICustomerService customerService =contex.getBean("service", ICustomerService.class);
      
        customerService.add();
      
    }
}
