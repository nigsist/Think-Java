/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursiveoddsum;

/**
 *
 * @author USER ON PC
 */
import java.util.*;
public class Recursiveoddsum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
    System.out.println("Enter an odd number");
	int max = s.nextInt();
        if((max% 2) == 0) {
    System.out.println(max + " is Even number and therefore is invalid");
 }
    else{
    System.out.println("Enter a greater odd number");
        int m = s.nextInt();
        if (m <max){
    System.out.println("Invalid data");
}
       else{
    if((m % 2) == 0) {
System.out.println(m + " is Even number and therefore is invalid");

   }
          else{
    int data =  (addodd(m)- addodd(max))+max;

  System.out.print("sum:"+data);
		            }
		        }
		    }
		}

public static int addodd(int m)
		{

		    if(m<=0)
		    {
		        return 0;    
		    }

		    if(m%2 != 0)
		    {
		        return (m+addodd(m-1));
		    }
		    else
		    {
		        return addodd(m-1);
    }
   }
}
