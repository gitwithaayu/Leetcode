class Solution {
    public String reverseWords(String s) {
       String arrs[]=s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=arrs.length-1;i>=0;i--){
            sb.append(arrs[i]);
            if(i!=0)
            sb.append(" ");


        }
        return sb.toString();
        
    }
}
