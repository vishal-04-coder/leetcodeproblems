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
    ListNode* reverseBetween(ListNode* head, int left, int right) {
        if(!head->next || left==right ){
            return head;
        }
        vector<int> v;
        while(head!=NULL){
            v.push_back(head->val);
            head=head->next;
        }
        reverse(v.begin()+left-1,v.begin()+right);
        ListNode* res=new ListNode();
        ListNode* t=res;
        for(int i=0;i<v.size();i++){
            t->next=new ListNode(v[i]);
            t=t->next;
        }
        return res->next;
    }
};