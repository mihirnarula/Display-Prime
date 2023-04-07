package display_prime;
import java.util.*;
public class Display_Prime {

    
    public static void main(String[] args) {
        // creating scanner object
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.println("Prime numbers between 2 and " + num + " are: ");
        if(num > 2)
            System.out.println("2");
        
        int flag = 0;
        for(int i = 3; i <= num; i++){
                        
                for(int j = 2; j < i; j++){
                    if(i % j == 0)
                        flag = 1;
                }
                
            if(flag != 1)
                System.out.println(i);
            
                flag = 0; // reset value of flag
        }
    }
    
}
