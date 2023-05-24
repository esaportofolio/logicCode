import java.lang.*;
import java.io.*;
import java.util.*;

/*Approach Five : Ubah string yang dimasukkan menjadi array character menggunakan toCharArray(), metode bawaan dari kelas string
 * kemudian scan array karakter dari kedua sisi yaitu dari indeks awal (kiri) dan juga dari indeks terakhir (kanan) secara bersamaan
 * 
 * 1. Atur indeks kiri = 0, dan indeks kanan = panjang string - 1.
 * 2. Masukkan array yang pertama yang ingin ditukar kedalam temporary
 * 3. Tukar karakter pada index awal dengan karakter index akhir dengan menggunakan temporary sebagai penyimpanan sementara agar array yang ditukar bisa diisi
 * 4. Pindahkan array yang ditukar ke array yang kosong selesai penukaran
 * 5. Pindahkan pointer ke array  yang berikutnya
 * 6. lanjutkan sampe kiri kurang dari sama dengan kanan 
 */

public class StringReverse5 {
	public static void main (String[] args) {
		//variable declaration
		String usrIpt;
								
		//make new scanner
		Scanner keyboard = new Scanner(System.in);
		
		//saving user input into the variable
		System.out.println("Please Input Something : ");
		//nextLine means that the scanner will continue read everything until the next line / enter pressed and it will return skipped line
		usrIpt = keyboard.nextLine();
		
		char[] tmpAry = usrIpt.toCharArray();
		int kiri, kanan =0;
		kanan = tmpAry.length - 1;
		
		//for loop reference : https://www.geeksforgeeks.org/java-for-loop-with-examples/
		//hint: check the differences between "<" and ">" 
		for(kiri = 0; kiri < kanan; kiri++, kanan--) {
			//swap values of left and right
			char tmp = tmpAry[kiri];
			tmpAry[kiri]  = tmpAry[kanan];
			tmpAry[kanan] = tmp;
		}
		
		for (char c : tmpAry)
			System.out.print(c);
			System.out.println();
	}
}
