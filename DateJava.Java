/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date.java;

/**
 *
 * @author USER ON PC
 */
public class DateJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Day = "Friday";
        int Date = 7;
        String Month = "March";
        int Year = 1991;
        
        System.out.println("Today's Date is:");
        System.out.println("American Format:");
        System.out.print(Day);
        System.out.print(",");
         System.out.print(" ");
        System.out.print(Month);
        System.out.print(" ");
        System.out.print(Date);
        System.out.print(",");
        System.out.print(" ");
        System.out.print(Year);
        System.out.println(".");
        System.out.println("European Format:");
        System.out.print(Day);
        System.out.print(" ");
        System.out.print(Date);
        System.out.print(" ");
        System.out.print(Month);
        System.out.print(" ");
        System.out.print(Year);
        System.out.println(".");
    }
    
}
