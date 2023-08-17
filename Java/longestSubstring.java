/* longestSubString: given a string, s, returns the length of the longest substring
 * without repeating characters.
 */

 class SolutionLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        String longest = "";
        String current = "";
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (current.contains(String.valueOf(ch))) {
                current = String.valueOf(ch);
                System.out.println(current);
            } else {
                current += String.valueOf(ch);
                if (current.length() > longest.length()) {
                    longest = current;
                    System.out.println("longest: "+longest);
                }
                System.out.println(current);
            }
        }

        

        return longest.length();
    }

    public static void main(String args[]) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}