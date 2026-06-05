/**
 * Problem: Roman to Integer (#13)
 * Link: https://leetcode.com/problems/roman-to-integer/
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public String intToRoman(int num) {
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] characters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder output = new StringBuilder();

        for (int index = 0; index < numbers.length; index++) {
            while (num >= numbers[index]) {
                output.append(characters[index]);
                num -= numbers[index];
            }
        }

        return output.toString();
    }
}