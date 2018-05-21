/*
 * Name : Chintan Patel
 * CSU ID : 2473177
 * Assignment 3 = Auto Insurance Program
 */

import java.util.Scanner;


public class Insurance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	    final double basicRate = 500;
	    double rate;
	    int  age;
	    int numAccidents;
	    int  ageSurcharge = 0;
	    int  accidentSurcharge = 0;
	    boolean error = false, tooMany = false;
	    
	    System.out.println ("How old is the driver?" + " : ");
	    age = input.nextInt();

	    System.out.println("How many accidents do you have in past 10 years?" + " : ");
	    numAccidents = input.nextInt();


	    if (age < 0){
	    	error = true;
	    	
	    }else if (age < 25){
	    	ageSurcharge = 100;
	    	
	    }else{
	    	ageSurcharge = 0;
	    }
	    
	    if (numAccidents < 0){
	        error = true;
	        
	    }else if (numAccidents == 0){
	        accidentSurcharge = 0;
	        
	    }else if (numAccidents == 1){
	        accidentSurcharge = 50;
	        
	    }else if (numAccidents == 2){
	        accidentSurcharge = 125;
	        
	    }else if (numAccidents == 3){
	        accidentSurcharge = 225;
	        
	    }else if (numAccidents == 4){
	        accidentSurcharge = 375;
	        
	    }else if (numAccidents == 5){
	        accidentSurcharge = 575;
	        
	    }else if (numAccidents == 6){
	        accidentSurcharge = 1000000;

	    }else{
	    	tooMany = true;
	    }
	    
	    if (error){
	        System.out.println("There has been error in the data that!!! ");
	                  
	    } else if (tooMany){
	        System.out.println("You have had too many accidents to insure you.");
	        
	    }else {
	        System.out.println("The basic rate is" + " $ " + basicRate);
	        
	    }if (ageSurcharge > 0){
	    	 System.out.println("There is an extra "+ "surcharge of $" + ageSurcharge + " because the driver is"+ " under 25.");
	    	
	    }if (accidentSurcharge > 0){
	              System.out.println("There is an extra" + "surcharge of $"+ accidentSurcharge + " because the driver had " + numAccidents   + " accident(s).");
	
	      rate = basicRate + ageSurcharge  + accidentSurcharge;
	                           
	            System.out.println("The total charge is $" + rate);
	    }
	}
}
