/**
 * Problem: Roman to Integer (#13)
 * Link: https://leetcode.com/problems/roman-to-integer/
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> dictionary = new HashMap<>();
        dictionary.put('I', 1);
        dictionary.put('V', 5);
        dictionary.put('X', 10);
        dictionary.put('L', 50);
        dictionary.put('C', 100);
        dictionary.put('D', 500);
        dictionary.put('M', 1000);

        int total = 0;

        for (int position = 0; position < s.length(); position++) {
            int currentValue = dictionary.get(s.charAt(position));
            int nextValue   = (position + 1 < s.length()) ? dictionary.get(s.charAt(position + 1)) : 0;

            if (currentValue < nextValue)
                total -= currentValue;
            else
                total += currentValue;
        }

        return total;
    }
}