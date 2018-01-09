/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package american;

/**
 *
 * @author USER ON PC
 */
public class American {

    /**
     * @param args the command line arguments
     */
    public static void AmericanTime(String day, int date,String month, int year){
    	System.out.println("American Format:\n");
    	System.out.println(day + month +date+", "+ year+"\n");
		
	}
    public static void EuropeanTime(String day, int date,String month, int year){
	System.out.println("European Format:\n");
	System.out.println(day +" "+ date + month +" "+ year);
	
	}
	
    public static void main(String [] args){
	
    	String day,month;
    	int date;
    	int year;
    	date=22;
    	day ="Thursday,"; 
    	month=" July ";
    	year= 2015;
    	
    	EuropeanTime(day, date, month, year);
		AmericanTime( day,  date, month, year);
        // TODO code application logic here
    }
    
}
