
package stringstack;

import java.util.Stack;

public class StringStack {

    
    public static void main(String[] args) {
        
          Stack<String>ss1=new Stack<>();
        
        ss1.push("Shadman");
        ss1.push("Sanjida");
        ss1.push("Sharmin");
        ss1.push("Tawhid");
        ss1.push("Keya");
        ss1.push("Nisha");
        ss1.push("Antor");
        ss1.push("Parisa");
        ss1.push("Shorna");
        ss1.push("Taskiya");
        
 System.out.println(ss1.isEmpty());
        
          while(ss1.isEmpty()!=true){
         System.out.println(ss1.peek());
         ss1.pop();
     }
        
          System.out.println(ss1.isEmpty());
        
        
        
        
        
        
            }
    
}
