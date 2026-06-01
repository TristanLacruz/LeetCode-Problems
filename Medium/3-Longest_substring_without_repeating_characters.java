/**
 * Problem: Longest Substring Without Repeating Characters (#3)
 * Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * Approach: Tracking last seen index of each char with a HashMap
 * Time Complexity:  O(n)
 * Space Complexity: O(n)
 */
class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char, int> lastSeen;
        int longest = 0;
        int start = 0;

        for (int end = 0; end < s.size(); end++) {
            char c = s[end];

            if (lastSeen.count(c) && lastSeen[c] >= start)
                start = lastSeen[c] + 1;

            lastSeen[c] = end;
            longest = max(longest, end - start + 1);
        }
        return longest;
    }
};