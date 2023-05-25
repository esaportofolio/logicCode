import java.lang.*;
import java.io.*;
import java.util.*;

/*Approach 4 : Mengubah string menjadi character array : Pengguna memasukkan string yang akan dibalik
 * 1. ubah string menjadi array character dengan menggunakan metode kelas string Java bawaan : toCharArray()
 * 2. pindai string dari ujung ke awal, dan cetak karakter satu persatu
 */
public class StringReverse4 {
	public static void main (String[] args) {
		//variable declaration
		String usrIpt;
		int i;				
		//make new scanner
		Scanner keyboard = new Scanner(System.in);
						
		//saving user input into the variable
		System.out.println("Please Input Something : ");
		//nextLine means that the scanner will continue read everything until the next line / enter pressed and it will return skipped line
		usrIpt = keyboard.nextLine();
		//close scanner
		keyboard.close();
		
		//convert string to character Array by using toCharArray
		char[] cvtStrg = usrIpt.toCharArray();
		
		for(i = cvtStrg.length - 1; i >= 0; i--) {
			//check differences betweeen print and println
			System.out.print(cvtStrg[i]);
		}	
	}
}
