/**
For each given line , print out if it is an instance of a primitive or referenced type 
as well as which data type it is
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        String[] inputs = {"5.35","a","false","100","I am a code monkey","true","17.3","c","derp"};
        
        for(int i = 0; i < inputs.length; i++){
            
            String input = inputs[i];
            int x = 0;
                try{
                    x = Integer.parseInt(input);
                    System.out.println("Primitive : int");

                }catch(Exception e2){

                    try{

                        Double.parseDouble(input);
                        System.out.println("Primitive : double");

                    }catch(Exception e3){
                        
                        if(input.length() == 1){
                            System.out.println("Primitive : char");
                        }else if(input.equals("false")||input.equals("true")){
                            System.out.println("Primitive : boolean");
                        }else{
                            System.out.println("Referenced : String");
                        }
                            
                }
            }
        }
    }
}