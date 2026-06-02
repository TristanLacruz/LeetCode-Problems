/**
 * Problem: Longest Palindromic Substring (#5)
 * Link: https://leetcode.com/problems/longest-palindromic-substring/
 *
 * Time Complexity:  O(n²)
 * Space Complexity: O(1)
 */
class Solution {
public:
    string longestPalindrome(string s) {
        int anchor = 0, best = 0;

        for (int mid = 0; mid < s.size(); mid++) {
            trying(s, mid, mid,     anchor, best); // odd length
            trying(s, mid, mid + 1, anchor, best); // even length
        }

        return s.substr(anchor, best);
    }

private:
    void trying(const string& s, int lo, int hi, int& anchor, int& best) {
        while (lo >= 0 && hi < s.size() && s[lo] == s[hi]) {
            lo--;
            hi++;
        }

        int length = hi - lo - 1;
        if (length > best) {
            best = length;
            anchor = lo + 1;
        }
    }
};