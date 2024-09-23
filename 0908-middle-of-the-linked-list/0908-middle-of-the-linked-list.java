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
    public ListNode middleNode(ListNode head) 
    {
        ListNode save = head;
        int cnt = 0;
        while(save!=null)
        {
            save = save.next;
            cnt++;
        }
        int mid = cnt/2;
        if(cnt%2==0)
        {
            mid = (cnt+1)/2;
        }
        for(int i=0;i<mid;i++)
        {
            head = head.next;
        }
        return head;
    }
}