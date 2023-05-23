//untuk menghubungkan perintah - perintah dalam program yang yang digunakan untuk kompiler ke semua program java tersebut. 
import java.lang.*;
// string reverse 1
import java.io.*;
//string reverse 1
import java.util.*;

 /*
 * approach two : Mengubah String menjadi Bytes dengan metode getBytes() digunakan untuk mengubah string input menjadi byte[].
 * 1. Buat byte[] sementara dengan panjang yang sama dengan panjang input string.
 * 2. Simpan byte[] (yang kita dapatkan dengan metode getBytes() dalam urutan terbalik kedalam byte sementara
 * 3. Buat abject string baru menggunakan byte[] untuk menyimpan hasil
 */

public class StringReverse2 {
	public static void main (String[] args){
		//variable declaration
		String usrIpt;
		
		//make new scanner
		Scanner keyboard = new Scanner(System.in);
		
		//saving user input into the variable
		System.out.println("Please Input Something : ");
		//nextLine means that the scanner will continue read everything until the next line / enter pressed and it will return skipped line
		usrIpt = keyboard.nextLine();
		
		//getBytes() method to convert string into byte[].
		/*
		 * byte[] adalah deklarasi tipe data byte
		 * getBytes() is a command from java to convert string to array of bytes
		 */
		byte[] getByte = usrIpt.getBytes();
		byte[] rslt = new byte [getByte.length];
		
		//Store result in reverse order into the result byte[]
		//looping
		for (int i=0; i < getByte.length; i++ ) {
			rslt[i] = getByte[getByte.length - i - 1];
		  //rslt[0] = getByte[getByte.length - 0 - 1];
		}
		//hint : try to move this command on the loop to see the process
		System.out.println("Hasil Reversal Adalah : ");
		System.out.println(new String(rslt));
	}

}
