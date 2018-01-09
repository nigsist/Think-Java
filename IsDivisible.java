/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isdivisible;

/**
 *
 * @author USER ON PC
 */
import java.util.Scanner;
public class IsDivisible {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b;
	boolean ans;
        Scanner sc = new Scanner(System.in);
    System.out.println("enter value for a");
        a=sc.nextDouble();
    System.out.println("enter value for b");
        b=sc.nextDouble();
        ans=isDivisible(a,b);
    System.out.println(ans);

}
    public static boolean  isDivisible(double n,double m){
	
	if (n>0 && m>0){
		return true;
	}else{
	
		return false;
    }
} 
}
