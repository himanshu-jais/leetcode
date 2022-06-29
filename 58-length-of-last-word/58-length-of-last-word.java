import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
       String[] result = s.split(" ");
        int l=result.length;
       int k=result[l-1].length();
        
        
        System.out.print("The last word is "+(char)34+result[l-1]+(char)34);
        return k;
    }
        public static void main(String[] args)
        {
        Scanner sc=new Scanner(System.in);
            System.out.println("enter   string:");
               
          
           String k=sc.nextLine();
        Solution ob=new Solution();
          int h =ob.lengthOfLastWord(k);
            System.out.println("with length"+h);
            
    }
}