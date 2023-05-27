import java.lang.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

/* This program is to separate string and integer based on user input.
 * Output is : if you are putting ABCD1234 the program will say that :
 * Your String is : ABCD
 * Your Int is : 1234
 * Step by Step :
 * 1. System wait for user input until bye
 * 1. Identify every letter is string before space
 * 2. Identify every number is int before space
 * 3. Collect all identified string and put it into ArrayofList
 * 4. Collect all identified int and put it into ArrayofList
 * 5. Show all Strings
 * 6. Show all Int
 */


public class HRPreparationX {
	
	public static List<String> readUserInput() {
		//declare variables and list
		List<String> usrIpt = new ArrayList<>();
		System.out.println("Masukkan data yang diinginkan : (ketik 'bang udah bang :(' untuk menyudahi) ");
	    //create scanner class to take input from user
		Scanner keyboard = new Scanner(System.in);
	    //looping untuk menerima inputan user
		while (true) {
	    String nambahData = keyboard.nextLine();
	    if ("bang udah bang :(".equalsIgnoreCase(nambahData)) {
	         break;
	    }
	     	usrIpt.add(nambahData);
	    }
	    return usrIpt;
	}

	public static void main(String[] args) {
		//Set user input variable
		List<String> usrIptA = readUserInput();
		//StringBuilder usrIptA = new StringBuilder(readUserInput());
		System.out.printf("User Input Data :\n%s", String.join("\n", usrIptA));
		
		/*
		for (Character ch : usrIptA){
			usrIptA.append(ch);
		}
		*/
		
		//Set string result variable
		List<String> strPart = new ArrayList<>();
		List<String> intPart = new ArrayList<>();
		
		StringBuilder crtStg = new StringBuilder();
		StringBuilder crtNum = new StringBuilder();
		
		for (int i=0 ; i < usrIpt.length(); i++) {
			char c = usrIpt.charAt(i);
		
			if (Character.isDigit(c)){
				crtNum.append(c);
				if (crtStg.length() > 0) {
					strPart.add(crtStg.toString());
					crtStg.setLength(0);
				}
			}
		}
	}
	
	
	
	
	
	
		
	
}
