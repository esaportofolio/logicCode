import java.lang.*;
import java.util.*;
import java.io.*;

// HR Title : Java Output Programming
public class HRPreparation4 {
	public static void main (String[] args) {
		Scanner kbrd = new Scanner(System.in);
	
		System.out.println("================================");
		for (int i=0;i<3;i++) {
			String usrIptS	= kbrd.next();
			int usrIptI 	= kbrd.nextInt();
			//printf formating ref : https://stackoverflow.com/questions/9849800/java-system-out-print-formatting
			//"%-15s" means that within 15 blank space, the String "s1" will be filled in the left. (fill in the blanks from the left) "%03d" means that within 3 0s, the integer"x" will be filled in the right.(fill in the zeros from the right).
			System.out.printf("%-15s%03d\n", usrIptS,usrIptI);
		}
		System.out.println("================================");
	}
}
