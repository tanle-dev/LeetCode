class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedStr = new StringBuilder();

        int i;
        for (i = 0; i < word1.length(); i++) {
            mergedStr.append(word1.charAt(i));
            if (i < word2.length())
                mergedStr.append(word2.charAt(i));
        }

        if (i < word2.length()) {
            mergedStr.append(word2.substring(i, word2.length()));
        }

        return mergedStr.toString();
    }
}