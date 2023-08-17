// validPalindrome: checks whether an inputted string, s, is a palindrome or not

class SolutionValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        // getting rid of non alphanumeric characters
        String s2 = "";
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch>=97 && ch<=122) || (ch>=48 && ch<=57)) {
                s2 = s2 + String.valueOf(ch);
            }
        }
        // s2 = s2.substring(1, s2.length());
        System.out.println(s2);

        // check is string is a palindrome
        // for (int i=0; i<s.length(); i++) {
        //     System.out.println(s.charAt(i));
        //     if (s.charAt(i) != s.charAt((s.length()-1)-i)) {
        //         System.out.println("left: "+s.charAt(i));
        //         System.out.println("right: "+s.charAt(s.length()-1-i));
        //         return false;
        //     }
        // }

        // int i = 0;
        // int j = s.length()-1;
        // while (i < ((s.length() - 1) / 2) && j > ((s.length() - 1) / 2)) {
        //     System.out.println((int)s.charAt(i));
        //     System.out.println((int)s.charAt(j));
        //     if (s.charAt(i) == (char)32) {
        //         i++;
        //     } else if (s.charAt(j) == (char)32) {
        //         j--;
        //     } else {
        //         if (s.charAt(i) != s.charAt(j)) {
        //             return false;
        //         }
        //     }
        //     i++;
        //     j--;
        // }

        for (int i=0; i<s2.length()/2; i++) {
            int j = (s2.length()-1) - i;
            // System.out.println("s at i: "+s.charAt(i));
            // System.out.println("s at j: "+s.charAt(j));
            if (s2.charAt(i) == (char)32) {
                i++;
                System.out.println("hi");

            }
            if (s2.charAt(j) == (char)32) {
                j--;
                System.out.println("hi");

            }
            if (s2.charAt(i) != s2.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        String s = " ";
        System.out.println(isPalindrome(s));
    }
}






