/**
 * Problem: Add Two Numbers (#2)
 * Link: https://leetcode.com/problems/add-two-numbers/
 *
 * Approach: Run both lists simultaneously, carry the flow to the next node
 * Time Complexity:  O(max(n, m))
 * Space Complexity: O(max(n, m))
 */
class Solution {
 public:
  ListNode* addTwoNumbers(ListNode* a, ListNode* b) {
    ListNode result(0);
    ListNode* current = &result;
    int sum = 0;

    while (a || b || sum) {
      if (a != nullptr) {
        sum += a->val;
        a = a->next;
      }
      if (b != nullptr) {
        sum += b->val;
        b = b->next;
      }
      current->next = new ListNode(sum % 10);
      sum /= 10;
      current = current->next;
    }

    return result.next;
  }
};