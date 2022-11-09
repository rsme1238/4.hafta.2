
package pkg4.hafta.pkg2;

import java.util.Scanner;

 
public class Hafta2 {

    
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       
      
        System.out.println("Write here the X value ");
        int x = input.nextInt();
        
        int fx =(x*x) -5*x+3;
         int b;
        
        if(fx<0){
          b = -1;}
          
        else if(fx==0){
             b = 0;}
          
        else{
             b = +1;
            }
        System.out.println("value is: "+ b);
    }
    
}