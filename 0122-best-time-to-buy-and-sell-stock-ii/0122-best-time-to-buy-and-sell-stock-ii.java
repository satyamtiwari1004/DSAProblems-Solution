class Solution {
    public int maxProfit(int[] prices) {
        int start=0;
        int maxProfit=0;
        int temp=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[start]){
                temp+=prices[i]-prices[start];
                start++;   
            }else{
                start=i;
            }
        }
        return temp;
    }
}