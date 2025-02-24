/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        ListNode curr=new ListNode(0,head);
        for(ListNode dummy=curr;dummy.next!=null;){
            if(set.contains(dummy.next.val)){
                dummy.next=dummy.next.next;
            }
            else{
                dummy=dummy.next;
            }
        }
        return curr.next;
    }
}