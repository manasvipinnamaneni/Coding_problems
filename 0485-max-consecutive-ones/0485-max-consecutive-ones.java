class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int curr = 0;
        for(int num : nums) {
            if(num == 1) {
                curr++;
            }
            else {
                max = Math.max(max, curr);
                curr = 0;
            }
        }
        if(max > curr) {
            return max;
        }
        else {
            return curr;
        }
    }
}