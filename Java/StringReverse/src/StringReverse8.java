import java.lang.*;
import java.util.*;
import java.io.*;

/* Approach 8 : Menggunakan Stack
 * idenya adalah memasukkan semua character kedalam tumpukan lalu mengambil semua tumpukan kedalam temporary buffer
 * jadi misalkan string yang diinput itu adalah "ABCD" setelah dimasukkan kedalam stack jadinya
 * A B C D -> D C B A karena stack mengambil karakter paling awal untuk diletakkan di paling akhir
 * Setelah itu karakter dalam stack itu dipindahkan langsung ke temporary dengan menggunakan metode pop
 */
public class StringReverse8 {
	public static void main (String[] args) {
		//variable declaration
		String usrIpt;
										
		//make new scanner
		Scanner keyboard = new Scanner(System.in);
				
		//saving user input into the variable
		System.out.println("Please Input Something : ");
		//nextLine means that the scanner will continue read everything until the next line / enter pressed and it will return skipped line
		usrIpt = keyboard.nextLine();
		//close keyboard
		keyboard.close();
		
		//Referensi Stack : https://www.geeksforgeeks.org/stack-class-in-java/
		Stack<Character> tumpukan = new Stack<>();
		
		for (char c:usrIpt.toCharArray())
		{
			//push all character to stack
			tumpukan.push(c);
		}
		System.out.println("Stack paling atas adalah : " +tumpukan.peek());
		
		//deklarasi temporary
		String tmp = "";
		
		while(!tumpukan.isEmpty())
		{
			//popping all characters and appending to temp
			//+= artinya adalah Pengisian dan penambahan 
			tmp += tumpukan.pop();
		}
		
		//Run code dibawah untuk melihat bahwa stack berhasil di pop
		//kalau stack berhasil dipop maka akan muncul error
		//System.out.println("Stack paling atas sekarang adalah : " +tumpukan.peek());
		
		System.out.println("Reversed String adalah : " +tmp);
	}

}
