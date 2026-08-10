class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--.."
        };
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        HashSet<String> set = new HashSet<>();
        for (String word : words) {
            String code = "";
            for (char ch : word.toCharArray()) {
                int index = alphabet.indexOf(ch);
                code += morse[index];
            }
            set.add(code);
        }
        return set.size();
    }
}