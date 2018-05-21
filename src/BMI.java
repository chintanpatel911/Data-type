/*
 * Name : Chintan Patel
 * CSU ID : 2473177
 * Assigment 2 = Calculate Body Mass Index
 */
import java.text.DecimalFormat;
import java.util.Scanner;


public class BMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.####");
		// Decimal format in up to four places
		
		double weight;
		double height;
		
		System.out.println("Please enter a weight in pounds");
		// Ask user to put the weight
		weight = input.nextDouble();
		
		System.out.println("Please enter height in inches");
		// Ask user to put height
		height = input.nextDouble();
		
		final double Kilograms_Per_Pound =  0.45359237; 
		final double Meaters_Per_Inches = 0.0254;
		// Used final double to make conversion permanent 
		
		
		double WeightInKilograms = weight * Kilograms_Per_Pound;
		double HeightInMeaters = height * Meaters_Per_Inches;
		double BMI = WeightInKilograms/ (HeightInMeaters*HeightInMeaters);
		
		
		System.out.println("Your Body Mass Index is :"+ df.format(BMI));

	}// Class end

}// End of the method 
