class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1) {
            set.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++) {
            int current = nums1[i];
            int greater = -1;
            for(int j = 0; j < nums2.length; j++) {
                if(nums2[j] == current) {
                    for(int k = j + 1; k < nums2.length; k++) {
                        if(nums2[k] > current) {
                            greater = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
            list.add(greater);
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}