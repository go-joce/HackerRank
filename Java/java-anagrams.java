import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
	   char[] aArray = A.toLowerCase().toCharArray();
	   char[] bArray = B.toLowerCase().toCharArray();
	   Arrays.sort(aArray);
	   Arrays.sort(bArray);
	   return Arrays.equals(aArray, bArray);
   }
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
		boolean result = isAnagram(A,B);
		
        if(result)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
      
    }
}
