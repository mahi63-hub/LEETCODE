class Solution {
    public List<String> commonChars(String[] words) {

        int[] common = new int[26];

        for (char c : words[0].toCharArray()) {
            common[c - 'a']++;
        }

        for (int j = 1; j < words.length; j++) {
            int[] freq = new int[26];

            for (char c : words[j].toCharArray()) {
                freq[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                common[i] = Math.min(common[i], freq[i]);
            }
        }

        List<String> res = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            while (common[i] > 0) {
                res.add(String.valueOf((char) ('a' + i)));
                common[i]--;
            }
        }

        return res;
    }
}