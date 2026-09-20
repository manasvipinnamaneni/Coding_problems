class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums1) {
            set.add(num);
        }
        for(int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])) {
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int nums[] = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}