class Solution {
    public boolean validPalindrome(String s) {
        return validPalindrome(s, 0, s.length() - 1);
    }

    private boolean validPalindrome(String s, int left, int right) {

        while(left < right) {

            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }
            else {
                return isPalindrome(s, left + 1, right) ||
                       isPalindrome(s, left, right - 1);
            }
        }

        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {

        while(left < right) {

            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}