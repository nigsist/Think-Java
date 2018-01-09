/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessrandomnumber;

/**
 *
 * @author USER ON PC
 */
import java.util.*;
public class GuessRandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int num;
          int offf=0;
	  rnd();
    }

	public static void rnd(){
		int offf=0;
		int num;
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?\n");
		   
	   Scanner scan = new Scanner(System.in);
	System.out.println("Type a number: ");
	   num=scan.nextInt();
		 
        System.out.printf("\n Your guess is: %d", num);
	    Random random = new Random();
	    int number = random.nextInt(100) + 1;
	System.out.printf("\n The number I was thinking of is: %d \n",number);
	    offf=num-number;
	System.out.printf("You were off by: %d", offf);
	    if(num<number){
 	System.out.println("\n your guess is too low ");
	System.out.println("\n Try again ");
	    rnd();
}           else
	        {
	System.out.println("\n your guess is too high ");
	System.out.println("\n Try again ");
	rnd();
    }
  }
}
