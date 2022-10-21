/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        vector<int> pali;
        while(head->next!=NULL){
            pali.push_back(head->val);
            head = head->next;
        }
        vector<int> pali2 = pali;
        reverse(pali2.begin(),pali2.end());
        if(pali != pali2) return true;
        
        return false;
    }
};