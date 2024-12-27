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
    ListNode* reverseList(ListNode* head) {
        vector<int> v;
        while(head!=NULL){
            v.push_back(head->val);
            head=head->next;
        }        
        reverse(v.begin(),v.end());
        ListNode* ans=new ListNode();
        ListNode* t=ans;
        for(int i=0;i<v.size();i++){
        t->next=new ListNode(v[i]);
        t=t->next;
        }
        return ans->next;
    }
};