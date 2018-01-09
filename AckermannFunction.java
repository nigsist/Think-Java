/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ackermannfunction;

/**
 *
 * @author USER ON PC
 */
public class AckermannFunction {

    /**
     * @param args the command line arguments
     */
     public static int Ack(int m, int n) {

	      if (m == 0) {
	       return 2 * n;
	      } else if (m >= 1) {
	       if (n == 0) {
	        return 0;
	       } else if (n == 1) {
	        return 2;
	       } else {
	        return Ack(m - 1, Ack(m, n - 1));
	       }
	      }
	      return n;
	      }

	     public static void main(String args[]) {
	    	 int r=Ack(3,2);
	    System.out.println(r);
    }
    
}
