import java.lang.*;
import java.util.*;
import java.io.*;

/* Approach 7 : Karena class string tidak memiliki method reverse(), maka kita perlu mengonversi string input menjadi StringBuffer, yang dicapai dengan 
 * menggunakan metode kebalikan dari StringBuffer 
 * 
 */
public class StringReverse7 {
	public static void main (String[] args) {
		//variable declaration
		String usrIpt;
								
		//make new scanner
		Scanner keyboard = new Scanner(System.in);
		
		//saving user input into the variable
		System.out.println("Please Input Something : ");
		//nextLine means that the scanner will continue read everything until the next line / enter pressed and it will return skipped line
		usrIpt = keyboard.nextLine();
		keyboard.close();
		
		//StringBuffer Reference : https://www.geeksforgeeks.org/stringbuffer-class-in-java/
		//Conversion from string object to string buffer
		StringBuffer sbr = new StringBuffer(usrIpt);
		sbr.reverse();
		System.out.print(sbr);
	}

}
