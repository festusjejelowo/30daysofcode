/**
Given array of 6x6 2D
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

find hour glass with max sum of elements within

B0             B1             B2              B3             B4                    B5
A0(0,3) 1 1 1  A0(1,4) 1 1 0  A0(2,5) 1 0 0   A0(3,6) 0 0 0  A1(0,3)0 1 0
A1(0,3) 0 1 0  A1(1,4) 1 0 0  A1(2,5) 0 0 0   A1(3,6) 0 0 0  A2(0,3)1 1 1
A2(0,3) 1 1 1  A2(1,4) 1 1 0  A2(2,5) 1 0 0   A2(3,6) 0 0 0  A3(0,3)0 0 2

@author Jejelowo B. Festus
@author festus.jejelowo@hotmail.com
*/
import java.util.Scanner;
import java.util.Arrays;

public class Solution11{

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for(int i=0; i < 6; i++){
			for(int j=0; j < 6; j++){
				arr[i][j] = in.nextInt();
			}
		}

		Object[] B = new Object[(int)Math.pow(((6*6)/(3*3)),2)];
		Integer[] sum = new Integer[(int)Math.pow(((6*6)/(3*3)),2)];
		for(int x = 0; x < B.length; x++){

			B[x] = createHourGlass(arr,x);
			sum[x] = new Integer(sumHourGlass((int[][])B[x]));
		}
		int max = Arrays.asList(sum).stream().mapToInt(Integer::intValue).summaryStatistics().getMax();
		System.out.println(max);
	}

	private static int[][] createHourGlass(int[][] A,int i){

	  int[][] HG = new int[3][3];
	  int index = 0;
	  int from = 0;

	  for(int x = 0; x < 3;x++){

		 index = x +(int)(i/4);
		 from = i - ((int)(i/4))*4;
		 int to =  from + 3;
		 HG[x] = Arrays.copyOfRange(A[index],from,to);

	  }
	   return HG;
	}


   private static int sumHourGlass(int[][] HG){

	  int sum = 0;
	  for(int k = 0; k < HG.length; k++){
		for(int m = 0; m < 3; m++){
		 if(((k == 1) && (m == 0))||((k == 1) && (m == 2))){
			sum = sum + 0;
		 }else{
		   sum = sum + HG[k][m];
		}
	  }
     }
	  return sum;
   }

  private static void printHourGlass(int[][] HG,boolean isMax){

	  if(!isMax) return;
	  for(int k = 0; k < HG.length; k++){
		for(int m = 0; m < 3; m++){
		 if(((k == 1) && (m == 0))||((k == 1) && (m == 2))){
			System.out.print(" ");
		 }else{
		   System.out.print(HG[k][m]);
		}
	  }
	  System.out.println("");
	  }
  }

}