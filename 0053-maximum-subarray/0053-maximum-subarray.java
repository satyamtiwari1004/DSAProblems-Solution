class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }

        int tempSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            tempSum+=nums[i];
            if(tempSum>maxSum){
                maxSum=tempSum;
            }
            if(tempSum<0){
                tempSum=0;
            }
        }
        return maxSum;
    }
}