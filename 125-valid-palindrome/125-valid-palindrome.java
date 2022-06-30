import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        s.trim();
        int l=s.length();
        String j="";
        String n="";
        for(int i=0;i<l;i++)
        {
         char ch=s.charAt(i);
         int f=(int)ch;
         
            if(((f>=65)&&(f<=90))||((f>=97)&&(f<=122))||((f>=48)&&(f<=57)))
            {
                j=j+ch;
                n=ch+n;
            }
        
            }
            
            
            
            
        if(j.equalsIgnoreCase(n)==true){
            return true;
        }
        else
            return false;
        
        
        
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("enter   string:");
             
           String k=sc.nextLine();
        Solution ob=new Solution();
       boolean h= ob.isPalindrome(k);
         System.out.println(h);
        
}
}