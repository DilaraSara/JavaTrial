
package com.example.advancedjava;

public class MySqlCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Mysql veritabanına eklendi");
    }
}

