/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converttemperature;

/**
 *
 * @author USER ON PC
 */
import java.util.*;
public class ConvertTemperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     double c;
     String far="Fahrenheit",cel="Celsius";
     double f;
    Scanner in = new Scanner(System.in);

	        // prompt the user and get the value
    System.out.println("Enter the value of celcius:");
    c = in.nextDouble();

	        // convert and output the result]
    f = ((c *(9/5))+32);
	      
    System.out.printf("%.1f %s = %.1f %s \n",c,cel,  f, far);
    }
    
}
