class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();
        int res=0;
        for(String str:tokens){

            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                
                int num1=stack.pop();
                int num2=stack.pop();
                if(str.equals("+")) {
                    res = num2 + num1;
                }
                else if(str.equals("-")){
                 res=num2-num1;
               
                }
                else if(str.equals("*")){
                 res=num2*num1;
                }
                else{
                 res=num2/num1;
                }stack.push(res);
            }
            else{
                stack.push(Integer.parseInt(str));
            }

        }
        return stack.pop();
    }
}