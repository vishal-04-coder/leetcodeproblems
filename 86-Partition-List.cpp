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
    ListNode* partition(ListNode* head, int x) {
        ListNode* low=new ListNode();
        ListNode* high=new ListNode();
        ListNode* l=low;
        ListNode* h=high;
        while(head){
        if(head->val<x){
            l->next=head;
            l=l->next;

        }
        else{
            h->next=head;
            h=h->next;
        }
        head=head->next;
        h->next=nullptr;
        l->next=high->next;
        }
        return low->next;
    }
};