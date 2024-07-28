class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int L = 0;
        int R = n-1;
        while(L < R){
            int sum = numbers[L] + numbers[R];
            if(sum == target){
                return new int[] {L+1,R+1};
            }else if(sum < target){
                L++;
            }else{
                R--;
            }
        }
        return new int[]{-1,-1};
    }
}