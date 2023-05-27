import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// HR Title : Java If - Else

public class HRPreparation2{
	private static final Scanner kbrd = new Scanner(System.in);
    public static void main(String[] args) {
        int usrIpt = kbrd.nextInt();
        String ans = "";
        
        kbrd.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        kbrd.close();
        
        if(usrIpt % 2 != 0 ) {
        	ans = "Weird";
        }
        else {
        	if (usrIpt %2 == 0 && usrIpt >=2 && usrIpt<=5) {
        		ans = "Not Weird";
        	}
        	else if (usrIpt %2 == 0 && usrIpt >=6 && usrIpt<=20) {
        		ans = "Weird";
        	}
        	else {
        		ans = "Not Weird";
        	}
        }
        System.out.println(ans);
    }
}
