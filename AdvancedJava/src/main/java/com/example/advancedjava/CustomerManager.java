
package com.example.advancedjava;


public class CustomerManager implements ICustomerService{
    
    private final ICustomerDal customerDal;
    
    public CustomerManager(ICustomerDal customerDal) {
        super();
        this.customerDal = customerDal;       
    }   
    @Override
    public void add(){
        customerDal.add();
        
    }

    
}
