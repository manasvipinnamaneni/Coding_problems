class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        HashSet<Integer> set = new HashSet<>();
        int k = 0;
        for(int i = 0; i < n; i++) {
            if(!set.contains(candyType[i])) {
                set.add(candyType[i]);
                candyType[k] = candyType[i];
                k++;
            }
        }
        if(k > n/2) {
            return n/2;
        }
        return k;
    }
}