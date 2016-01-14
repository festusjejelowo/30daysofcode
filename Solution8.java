import java.util.*;
import java.io.*;
/*
You are given a phone book that consists of your friend's names and their phone number.
After that you will be given your friend's name as query.
For each query, print the phone number of your friend.
A name consists of only lower-case English letters and it may be in the format
'first-name last-name' or in the format 'first-name'.
Each phone number has exactly 8 digits without any leading zeros.
*/

public class Solution8{

   public static void main(String []argh){

        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		Map<String,String> contacts = new HashMap<String,String>();
		for(int i=0;i < n;i++){

		   String name = in.nextLine();
		   String phone = in.nextLine();
		   contacts.put(name,phone);

		}

		while(in.hasNext()){

		   String s = in.nextLine();
		   if(s == null) break;
		   if(contacts.get(s) == null){
			 System.out.println("Not found");
		 }else{
			 System.out.println(new StringBuilder().append(s).append("=").append(contacts.get(s)).toString());
		 }
      }
   }
}