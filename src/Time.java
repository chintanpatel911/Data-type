/*
 * Name : Chintan Patel
 * CSU ID : 2473177
 * Assigment1 = Data Type
 */
import java.util.Scanner;
public class Time {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int minute, second, hour, day ;
		
		System.out.println("Please enter the number of seconds elapsed : ");
		int totalseconds = input.nextInt();
		
		 
		second = totalseconds % 60; // reminder option 
		minute =(totalseconds / 60)% 60; 
		hour = (totalseconds / 3600)% 24;
		day = (totalseconds / 86400 + 1) % 7;
		
		System.out.println("HH:MM:SS"+ "=" +hour +":" + minute +":"+ second + " "+day);
		
	}

}
// Different way to write program
// HH : MM : SS [D]
// seconds = input.nextInt();
// ss = second % 60;
// minutes = second % 60;
// mm = minutes % 60;
// hours = seconds / 3600;
// hh = hours % 24;
// days = hours /24;
// d = 1+ days % 7;