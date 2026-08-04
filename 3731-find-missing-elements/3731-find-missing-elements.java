class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int curr = nums[0];
        int len = nums.length;
        int end = nums[len-1];
        int index = 0;
        while(curr < end) {
            if(nums[index] == curr) {
                curr++;
                index++;
                continue;
            }
            else {
                while(curr < nums[index]) {
                    res.add(curr++);
                }
                index++;
                curr++;
            }
        }
        return res;
    }
}