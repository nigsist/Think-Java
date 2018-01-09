/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converttotalnumber;

/**
 *
 * @author USER ON PC
 */
import java.util.Scanner;
public class ConvertTotalNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,Hour,Minute,Second;
	       Scanner sc = new Scanner(System.in);
	       
        System.out.println("Enter Number of Seconds:");
	        
	        num = sc.nextInt();
	        Hour= (num % 86400)/3600;
	        Minute=((num % 86400 ) % 3600 ) / 60;
	        Second=((num % 86400 ) % 3600 ) / 60;
        System.out.printf("%d Seconds = %d Hour :  %d Minute :  %d Seconds",num, Hour,Minute,Second);
    }
    
}
