class Solution {
    public boolean isPalindrome(String s) {
       
        String str="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str+=Character.toLowerCase(s.charAt(i));
            }
        }
         int ptr1=0,ptr2=str.length()-1;

        while(ptr1<=ptr2){
            if(str.charAt(ptr1)!=str.charAt(ptr2)){
            return false;
            }
            ptr1++;
            ptr2--;

        }
        return true;
    }
}