import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MaxAbsoluteDifference {

  	private int[] elements;
  	public int maximumDifference;

	    public Difference(int[] elements){
	        this.elements = elements;
	    }

	public int computeDifference(){

	    int maxdiff = 0;
	    List<Integer> diff = new ArrayList<Integer>();
	    for(int x = 0; x < elements.length; x++){

	        int[] test;
	        if(x == 0){
				test = Arrays.copyOfRange(elements,1,elements.length);
			}else if(x == (elements.length - 1)){
				test = Arrays.copyOfRange(elements,0,elements.length -1);
			}else{

				int lower = x -1;
				int upper = x + 1;
				lower = (lower < upper)?lower:upper;
                upper = (upper > lower)?upper:lower;

				int[] left = Arrays.copyOfRange(elements,lower,upper);

				lower = x+1;
				upper = elements.length - x;
				lower = (lower < upper)?lower:upper;
                upper = (upper > lower)?upper:lower;

				int[] right = Arrays.copyOfRange(elements,lower,upper);
				test = combine(left,right);
			}

		  for(int j = 0; j < test.length; j++){
			  diff.add(new Integer(Math.abs(elements[x] - test[j])));
		  }

	   }

	   int max = diff.stream().mapToInt(Integer::intValue).summaryStatistics().getMax();
	   maximumDifference = max;
	   return max;
   }

   public int[] combine(int[] a,int[] b){

     int len = a.length + b.length;
     int[] combined = new int[len];
     System.arraycopy(a,0,combined,0,a.length);
     System.arraycopy(b,0,combined,a.length,b.length);

     return combined;
   }

   public static void main(String[] args) {

       	Scanner sc = new Scanner(System.in);
       	int N = sc.nextInt();
       	int[] a = new int[N];

       	for (int i = 0; i < N; i++) {
       		a[i] = sc.nextInt();
       	}

		Difference D = new Difference(a);
	    D.computeDifference();
	   System.out.print(D.maximumDifference);
   }
}