public class LongestSubstringWithoutRepeatingCharacters {

    private static int lengthOfLongestSubstring(String str) {
        int numOfChar = str.length();
        if (numOfChar > 50000) return -1;

        int count = 0;

        for (int i = 0; i < numOfChar; i++) {
            boolean[] visited = new boolean[256];

            for (int j = i; j < numOfChar; j++) {
                if (visited[str.charAt(j)]) {
                    break;
                } else {
                    count = Math.max(count, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }
            visited[str.charAt(i)] = false;
        }
        return count;
    }

    public static void main(String[] args) {
        String input;
        int output;

        input = "abcabcbb";
        output = lengthOfLongestSubstring(input);
        System.out.print(output + System.lineSeparator());

        input = "bbbbb";
        output = lengthOfLongestSubstring(input);
        System.out.print(output + System.lineSeparator());

        input = "pwwkew";
        output = lengthOfLongestSubstring(input);
        System.out.print(output + System.lineSeparator());

        input = "";
        output = lengthOfLongestSubstring(input);
        System.out.print(output + System.lineSeparator());
    }
}