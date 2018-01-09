/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bottles;

/**
 *
 * @author USER ON PC
 */
public class Bottles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=1;
	part1(n);
	}
	public static void part1(int n){
	while(n==1){
	if (n>=1){
System.out.println("99 bottles of beer on the wall");
	part1(n+=1);
	part2();
System.out.println("98 bottles of beer on the wall.");
System.out.println("No bottles of beer on the wall,");
System.out.println("no bottles of beer,");
	part3();
break;
        }
    }	
}
	public static void part2(){
            System.out.println("ya’ take one down, ya’ pass it around,");
	}
	public static void part3(){
            System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
            System.out.println("’cause there are no more bottles of beer on the wall!");
    }
    
}
