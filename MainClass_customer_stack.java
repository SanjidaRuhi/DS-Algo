
package com.dsa;

import java.util.LinkedList;
//import java.util.Stack;

public class MainClass_customer_stack {

    public MainClass_customer_stack() {
    }
    
    
    public static void main(String[] args){
        
            Customer c1= new Customer("Ruhi ","01345667764","faridpur");
            Customer c2= new Customer("Tonmoy ","01347864","Pabna");
            Customer c3= new Customer("Shorna ","01307063222","Faridpur");

  LinkedList<Customer> L1= new LinkedList<>();
   L1.add(c3);
  L1.add(c2);
  L1.add(c1);
  
System.out.println(L1.isEmpty());

for(int i=0;i<L1.size();i++){
   System.out.println(L1.get(i).getName()+" "+L1.get(i).getContactNumber()+" "+L1.get(i).getAddress());
   
    
  }

//while(L1.isEmpty() != true ){
//      System.out.println(L1.peek().getName()+" "+L1.peek().getContactNumber()+" "+L1.peek().getAddress());
//     L1.remove();
//    
//  }    
    
              System.out.println(L1.isEmpty());
            
            
            
            
            
            
//            
//           Stack<Customer>s1=new Stack<>();
//                System.out.println(s1.isEmpty());
//
//      s1.push(c1);
//      s1.push(c2);
//      s1.push(c3);
//      
//        System.out.println(s1.isEmpty());
//
//  while(s1.isEmpty() != true ){
//      System.out.println(s1.peek().getName()+" "+s1.peek().getContactNumber()+" "+s1.peek().getAddress());
//      s1.pop();
//      
//  }    
//      
//              System.out.println(s1.isEmpty());
//
//      
//    }
//    
    
}
}