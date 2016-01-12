import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
The first line of input contains N, the number of integers. The next line contains N integers separated by a space.

Constraints

1=N=1000
1=Ai=10000, where Ai is the ith integer in the array.

Output Format

Print the N integers of the array in the reverse order on a single line separated by a space.
*/
public class Solution7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];

        for(int i=0; i < N; i++){
            arr[i] = in.nextInt();
            if(N > 1000) break;
        }
        if((N >= 1) && (N <= 1000) ){
            for(int j  = arr.length -1; j >= 0; j--){
                System.out.print(arr[j]);
                if(j > 0) System.out.print(" ");
            }
        }
        System.out.println("");
    }
}