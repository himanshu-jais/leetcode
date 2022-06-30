class Solution {
    public String longestCommonPrefix(String[] strs) {
        if((strs==null)||(strs.length==0))
            return "";
        for(int i=0;i<strs[0].length();i++){
            char c=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                
             if (i == strs[j].length() || strs[j].charAt(i) != c)
                return strs[0].substring(0,i);
                }
        }
                
            
        
        return strs[0];
        
    }
               public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("enter   string array  ");
                   String l[]=new String[3];
                   for(int k=0;k<3;k++)
                   {
                        l[k]=sc.nextLine();
                   }
                     Solution ob=new Solution();
                   String h=ob.longestCommonPrefix(l);
                   System.out.println(h);
}
}