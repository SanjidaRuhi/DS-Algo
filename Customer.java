package com.dsa;

public class Customer {
    
    private String name;
	private String address;
	private String contactNumber;
        
     
        


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Customer(String name, String contactNumber, String address) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
    }
        
        
        
        
        
        
        
    
}
