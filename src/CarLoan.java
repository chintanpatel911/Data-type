/*
 * Name : Chintan Patel
 * CSU ID : 2473177
 * Assigment 2 = Calculate Car Loan
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class CarLoan {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.####");
		
		double annualIntRate;
		double CarPrice;
		double downpayment;
		double annualIntRate;
		double monthlyIntRate = annualIntRate / 12;
		int LoanPeriodInMonth;
		
		System.out.println("Please enter the car Price : ");
		CarPrice = input.nextDouble();
		
		System.out.println("Please enter the downpayment :");
	    downpayment = input.nextDouble();
	    
	    System.out.println("Please enter the annual intrest rate :" );
	    monthlyIntRate = annualIntRate / 12;
	   
	    System.out.println("Please enter the loan period in months :");
	    LoanPeriodInMonth = input.nextInt();
	    
	    double MonthlyPayment;
	    double principal = CarPrice - downpayment;
	    double r = monthlyIntRate;
	    double rate = 1 + monthlyIntRate;
	    double n = LoanPeriodInMonth;
	    
	    MonthlyPayment =  principal*((r*Math.pow(rate, n)) / (Math.pow(rate, n) - 1));
	    
	    System.out.println("Your Monthly payment is " + "=" +  MonthlyPayment);
	   

	}

}
