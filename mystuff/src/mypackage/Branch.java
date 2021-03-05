package mypackage;

import java.util.Random;


public class Branch {
	
public static void main(String[] args) {
        
        Random r = new Random();        
        int num = r.nextInt();

        if (num ) {
            
            System.out.println("The number is a prime number");
            
        } else {
            
            System.out.println("The number is not a prime number");
        }
    }

}
