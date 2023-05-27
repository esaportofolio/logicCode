import java.util.*;
import java.io.*;

class HRPreparation6{
    public static void main(String []argh){
        Scanner kbrd = new Scanner(System.in);
        int tampungan = kbrd.nextInt();
        for(int i=0; i<tampungan; i++){
            int data1 = kbrd.nextInt();
            int data2 = kbrd.nextInt();
            int data3 = kbrd.nextInt();
            int res = data1;
            for (int j=0; j<data3;j++) {
            	res += (int)(Math.pow(2,j)*data2);
            	System.out.print(Integer.toString(res) + ' ');
            }
        System.out.print('\n');
        }
        kbrd.close();
    }
}