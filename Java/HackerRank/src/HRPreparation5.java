import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

	// HR Title : Java Loops I
public class HRPreparation5 {
    //throws IO exception is an exception that is thrown when an I/O error occurs
	public static void main(String[] args) throws IOException {
        //on this code, we will try to use different method, such as buffered reader and learn the different of it comparing to scanner
		//check on this reference : https://www.baeldung.com/java-buffered-reader
		System.out.println("Masukkan angka yang diinginkan : ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//we prepare a variable for system to accomodate our request that user input must be an integer, also we user trim to make sure the data is not having leading or trailing spaces 
        //reference : https://www.tutorialspoint.com/how-to-read-integers-from-a-file-using-bufferedreader-in-java
		//trim reference : https://www.geeksforgeeks.org/java-string-trim-method-example/
		int tampungan = Integer.parseInt(reader.readLine().trim());
        
        reader.close();
        
        System.out.println("User input is : " +tampungan);
        
        //starting buffer manipulation :
        for (int i=0;i<11;i++) {
        	//We are using printf to show the result of all data
        	//%d awal refer pada tampungan, %d kedua refer pada i, %d%n itu refer pada tampungan*i
        	System.out.printf("%d x %d = %d%n", tampungan, i, tampungan*i);
        }
    }
}
