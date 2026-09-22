class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        HashSet<Integer> set = new HashSet<>();
        int k = 0;
        for(int num : candyType) {
            set.add(num);
        }
        if(set.size() > n/2) {
            return n/2;
        }
        return set.size();
    }
}