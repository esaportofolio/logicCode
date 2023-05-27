import java.util.*;
import java.io.*;
import java.lang.*;

// Java Stdin and Stdout II
public class HRPreparation3 {
	public static void main (String[] args) {
		Scanner kbrd   = new Scanner(System.in);
		int frstlne    = kbrd.nextInt();
		double scndlne = kbrd.nextDouble();
		kbrd.nextLine();
		String thrdlne = kbrd.nextLine();
		kbrd.close();
		
		System.out.println("String: " +thrdlne);
		System.out.println("Double: " +scndlne);
		System.out.println("Int: " +frstlne);
	}
}
