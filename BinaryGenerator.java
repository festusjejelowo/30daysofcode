import java.io.*;
import java.util.*;
/**
The first line contains a single integer, T, the number of test cases. 
The T subsequent lines of test cases each contain a single value, n, the base 10 positive integer to be converted.

Constraints 
1=T=1000 
1=n=231

Output Format

For each test case, print the value of n in binary on a new line.
*/
public class BinaryGenerator {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String I = sc.nextLine();
        int T = 1;
        try{
            T = Integer.parseInt(I);
        }catch(Exception e){
            return;
        }
        
        if(1 <= T && T <= 1000){
            for(int x = 0; x < T; x++){
                int num = Integer.parseInt(sc.nextLine());
                System.out.println(binary(num));
            }
        }
    }
    
    static String binary(int N){
        StringBuffer sb = new StringBuffer();
        if( N < 2){
            sb.insert(0,Integer.toString(N));
        }else{
            sb.insert(0,Integer.toString(N%2));
            int remainder = (int)(N/2);
            sb.insert(0,binary(remainder));
        }
        return sb.toString();
    }
}