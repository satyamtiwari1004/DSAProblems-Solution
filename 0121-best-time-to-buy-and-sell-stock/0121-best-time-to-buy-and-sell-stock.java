class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
         int currentprofit=0;
        for(int i=1;i<prices.length;i++){
            currentprofit+=prices[i]-prices[i-1];
            if(currentprofit>maxProfit){
                maxProfit=currentprofit;
            }else if(currentprofit<0){
                currentprofit=0;
            }
        }
        return maxProfit;
    }
}