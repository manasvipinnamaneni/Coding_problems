class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int arr[] = digits.clone();
        for(int i = n-1; i >= 0; i--) {
            if(arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int[] res = new int[n+1];
        res[0] = 1;
        return res;
    }
}