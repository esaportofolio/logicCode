import java.util.*;

/*In this challenge, you must read  integers from stdin and then print them to stdout. 
 * Each integer must be printed on a new line. 
 * To make the problem a little easier, a portion of the code is provided for you in the editor below.
 * HR Title : Java Stdin and Stdout I
 */

public class HRPreparation1 {
	public static void main (String[] args) {
	Scanner kbrd = new Scanner (System.in);
	System.out.println("Please input 3 number : ");
	int a = kbrd.nextInt();
	int b = kbrd.nextInt();
	int c = kbrd.nextInt();
	kbrd.close();
	
	System.out.println("First Number  : " +a);
	System.out.println("Second Number : " +b);
	System.out.println("Third Number  : " +c);
	}
}
