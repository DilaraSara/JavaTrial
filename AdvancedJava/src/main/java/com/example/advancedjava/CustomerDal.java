
package com.example.advancedjava;


public class CustomerDal implements ICustomerDal {
    @Override
    public void add(){
        System.out.println("Oracle veritabanına eklendi");
    }

}