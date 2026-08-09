class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        int max = candyType.length / 2;
        for(int i = 0; i < candyType.length; i++) {
            set.add(candyType[i]);
        }
        if(set.size() >= max) {
            return max;
        }
        else {
            return set.size();
        }
    }
}