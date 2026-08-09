class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        int duplicate = -1;
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += nums[i];
            if(set.contains(nums[i])) {
                duplicate = nums[i];
            }
            set.add(nums[i]);
        }
        int missing = totalSum - (sum - duplicate);
        list.add(duplicate);
        list.add(missing);
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}