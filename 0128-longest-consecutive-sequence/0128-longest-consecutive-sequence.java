class Solution {
    public int longestConsecutive(int[] nums) {
        //always consider the 0 size and 1 size array and edge cases
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return 1;
        }

        Arrays.sort(nums);

        int count = 1;        // at least one number forms a sequence
        int maxCount = 1;     // track the max

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i+1] == nums[i]) {
                // duplicate → skip
                continue;
            } else if (nums[i+1] - nums[i] == 1) {
                // consecutive → extend streak
                count++;
            } else {
                // break in sequence → reset
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }

        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
}