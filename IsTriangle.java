/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istriangle;

/**
 *
 * @author USER ON PC
 */
import java.util.*;
public class IsTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
	boolean result;
	Scanner sc = new Scanner(System.in);
    System.out.println("enter values of a,b,c");
        a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
    result=isTriangle(a,b,c);
    System.out.println(result);
}
    public static boolean isTriangle(int a,int b,int c){
	if(a>b+c || b>a+c || c>a+b){
	return false;
	}else{
	return true;
     }
    }
}
