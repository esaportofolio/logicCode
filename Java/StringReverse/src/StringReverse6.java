import java.lang.*;
import java.io.*;
import java.util.*;

/* Approach Six : Menggunakan Object Array List: Ubah String Input menjadi larik karakter dengan menggunakan metode bawaan toCharArray().
 * Kemudian tambahkan karakter Array kedalam object Array List.
 * java memiliki metode reverse() bawaan untuk Class Collections
 * Class Collections Reverse mengambil object daftar, untuk membalikkan object daftar setelah itu kita akan meneruskan object array list yang merupakan jenis daftar karakter
 * 
 * 1. Membuat object list itterator dengan menggunakan metode listIterator pada object array list
 * 2. Menyalin konten string ke object array list
 * 3. Menggunakan listItterator untuk mengulangi daftar
 * 4. Menggunakan listItterator untuk mengulang daftar secara terbalik dan mencetaknya satu persatu ke output.
 */

public class StringReverse6 {
		public static void main(String[] args) {
			//variable declaration
			String usrIpt;
									
			//make new scanner
			Scanner keyboard = new Scanner(System.in);
			
			//saving user input into the variable
			System.out.println("Please Input Something : ");
			//nextLine means that the scanner will continue read everything until the next line / enter pressed and it will return skipped line
			usrIpt = keyboard.nextLine();
			//close scanner
			keyboard.close();
			
			char[] olah = usrIpt.toCharArray();
			//List Itterators Reference : https://www.geeksforgeeks.org/iterators-in-java/
			List <Character> iL = new ArrayList<>();
			
			for (char c : olah)
				iL.add(c);
			
			//Collections Reference : https://www.geeksforgeeks.org/collections-in-java-2/
			Collections.reverse(iL);
			ListIterator li = iL.listIterator();
			while (li.hasNext())
				System.out.print(li.next());
		}
}
