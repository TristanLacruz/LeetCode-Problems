/**
 * Problem: String to Integer - atoi (#8)
 * Link: https://leetcode.com/problems/string-to-integer-atoi/
 *
 * Time Complexity:  O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int myAtoi(String s) {
        int pos = 0;
        int len = s.length();

        // skip spaces
        while (pos < len && s.charAt(pos) == ' ')
            pos++;

        // read optional sign
        int polarity = 1;
        if (pos < len && (s.charAt(pos) == '+' || s.charAt(pos) == '-')) {
            if (s.charAt(pos) == '-') polarity = -1;
            pos++;
        }

        // parse digits with overflow guard
        int total = 0;
        while (pos < len && Character.isDigit(s.charAt(pos))) {
            int unit = s.charAt(pos) - '0';

            if (total > (Integer.MAX_VALUE - unit) / 10)
                return polarity == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            total = total * 10 + unit;
            pos++;
        }

        return polarity * total;
    }
}