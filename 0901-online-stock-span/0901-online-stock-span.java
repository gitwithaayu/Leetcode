class StockSpanner {
    Stack<int[]>stack;
    int index;

    public StockSpanner() {
        stack=new Stack<>();
        index=0;        
    }
    
    public int next(int price) {
        while(!stack.isEmpty() && stack.peek()[0]<=price){
            stack.pop();
        }
        int span=0;
        int pge=-1;
        
        if(stack.isEmpty()){
            pge=-1;
        }
        else{
            pge=stack.peek()[1];
        }
        span=index-pge;
        stack.push(new int[]{price,index});
        index++;
        return span;
    }

}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */