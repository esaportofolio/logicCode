import java.lang.*;
import java.io.*;
import java.util.*;

/* approach three : Menggunakan metode reverse() bawaan dari kelas StringBuilder
 * note : kelas string tidak memiliki method reverse(), jadi kita perlu mengonversi string input ke StringBuilder,
 * yang dicapai dengan menggunakan metode append dari StringBuilder. 
 * Setelah itu, cetak karakter dari string terbalik dengan memindai dari indeks pertama hingga indeks terakhir
 */
public class StringReverse3 {
	public static void main (String[] args) {
		//variable declaration
		String usrIpt;
				
		//make new scanner
		Scanner keyboard = new Scanner(System.in);
				
		//saving user input into the variable
		System.out.println("Please Input Something : ");
		//nextLine means that the scanner will continue read everything until the next line / enter pressed and it will return skipped line
		usrIpt = keyboard.nextLine();
		
		//reference link : https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
		StringBuilder usrIpt1 = new StringBuilder();
		
		//reference link : https://www.geeksforgeeks.org/stringbuilder-append-method-in-java-with-examples/
		//append a string into StringBuilder usrIpt1
		usrIpt1.append(usrIpt);
		
		//reference link : https://www.javatpoint.com/java-stringbuffer-reverse-method#:~:text=The%20reverse()%20method%20of,character%20for%20the%20reverse%20operation.
		//reverse StringBuilder usrIpt1
		usrIpt1.reverse();
		
		//print reversed String
		System.out.println("Reverse String is : ");
		System.out.println(usrIpt1);
	}
}
