import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;

/*This program is to make regex as a separator for each word and number that we found on an sentence
 *Regex Reference : https://www.vogella.com/tutorials/JavaRegularExpressions/article.html
 */
public class RegularExpression {
	public static void main(String[] args) {
		//scanner untuk menerima user input
		System.out.println("Masukkan kata yang anda inginkan : ");
		Scanner kbrd = new Scanner(System.in);
        String usrIpt = kbrd.nextLine();
        //System.out.println("Stringnya adalah  : " +usrIpt);
		
        Pattern angka = Pattern.compile("\\d+");
        Pattern huruf = Pattern.compile("[a-zA-Z]+");
        
        Matcher cariAngka = angka.matcher(usrIpt);
        Matcher cariHuruf = huruf.matcher(usrIpt);
        
        while (cariHuruf.find()) {
        	System.out.print("Kata yang diesktrak adalah : " +cariHuruf.group()+ "\n");
        }
        
        while (cariAngka.find()) {
        	//return cariAngka.group();
        	System.out.print("Angka yang diesktrak adalah : " +cariAngka.group()+ "\n");
        }
        
        
	}
}
