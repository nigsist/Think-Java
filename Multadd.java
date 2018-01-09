/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multadd;

/**
 *
 * @author USER ON PC
 */
public class Multadd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int r=power(4,2);
System.out.println(r);
	}
    public static int power(double n,int m){
	
	double r;
	double m2=(double)m;
	
	if(Math.pow(n,m2)==1){
		return 1;
	}else
	{
		
	return (int)n*power(n,m-1);
	}
    }
    
}
