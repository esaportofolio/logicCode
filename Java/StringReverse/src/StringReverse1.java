//standard library untuk compile semua perintah kedalam compiler program
import java.io.*;
//library yang terdapat pada paket java.util yang berfungsi sebagai kelas untuk melakukan masukan dari keyboard berbasis DOS.
import java.util.Scanner;


/*approach one :
 * 1. melintasi panjang stringnya
 * 2. ekstrak setiap karakter saat melintas
 * 3. menambahkan karakter didepan string yang telah dilewati 
 */
public class StringReverse1 {
	/*
	 * public menandakan bahwa method main itu bersifat public, dapat dipanggil dimanapun.
	 * method, artinya sekumpulan code yang diberi nama dan melekat dalam class
	 * method main, artinya nama methodnya adalah main
	 * arti dari method main ini juga adalah method ini merupakan method yang pertama kali dijalankan,
	 * saat program dieksekusi, method main dapat diartikan sebagai ibu dari program program yang dijalankan dibawahnya
	 * void menandakan bahwa tipe data atau deklarasi code tidak memerlukan fungsi return
	 * static menandakan bahwa nilai berupa static
	 * String menyatakan bahwa argumen yang terdapat pada code java tersebut merupakan String
	 * args merupakan argumen bertipe data string yang mengandung array
	 * 
	 */
	public static void main (String[] args)
	{
		//variable declaration
		String usrIpt, rvrs = "";
		char chr;
		
		//make new scanner
		Scanner keyboard = new Scanner(System.in);
		
		//saving user input into the variable
		System.out.println("Input User");
		//nextLine means that the scanner will continue read everything until the next line / enter pressed and it will return skipped line
		usrIpt = keyboard.nextLine();
		//show output to the user
		System.out.println("Inputan User adalah : " +usrIpt);
		
		//loop command
		//length is use to count the length and return the length of the string
		for (int i=0; i < usrIpt.length(); i++) {
			/*charAt will make the string that you input become array for example
			* you input "abcd" will become 
			*           [0123]
			*/
			chr = usrIpt.charAt(i); //extracts each character
			rvrs = chr + rvrs;// add each character in front of existing string
		}
		System.out.println("Reversed String is : " +rvrs);
	}
}
