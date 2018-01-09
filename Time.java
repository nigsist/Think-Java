/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

/**
 *
 * @author USER ON PC
 */
public class Time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Hour=24;
	int Minute=59;
	int Second=60;
	
	double mins=(double)Minute;
	
	
     System.out.println("The current time is: ");
     System.out.print(Hour);
     System.out.print(":");
     System.out.print(Minute);
     System.out.print(":");
     System.out.println(Second);
     System.out.print(" Number of minutes since midnight: ");
     System.out.println(Hour * 60 + Minute);

     
     System.out.print("Fraction of the day that has passed: ");
     System.out.println(mins / 60);

     System.out.print("Percent of the hour that has passed: ");
     System.out.println(mins * 100 / 60);
        
        
    }
    
}
