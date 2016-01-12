import java.io.*;
import java.util.*;
/**
Euclid's Algorithm for Computing the GCD of two integers
using recursion
*/
public class EucliGCDAlgorithm {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = computeGcd(a,b);
        System.out.println(gcd);

    }

   static  int computeGcd(int a,int b){

          if( a == b){
             return a;
          }else{

              int min = (a < b)?a:b;
              int max = (a > b)?a:b;
              return computeGcd((max-min),min);
          }
          //return find_gcd(b,a%b);
      }
}