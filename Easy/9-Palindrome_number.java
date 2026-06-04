/**
 * Problem: Palindrome Number (#9)
 * Link: https://leetcode.com/problems/palindrome-number/
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;

        int mirror = 0;
        while (x > mirror) {
            mirror = mirror * 10 + x % 10;
            x /= 10;
        }

        return x == mirror || x == mirror / 10;
    }
};