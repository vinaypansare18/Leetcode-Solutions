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
import java.util.PriorityQueue;
class Solution 
{
    public ListNode mergeKLists(ListNode[] lists)
     {         // Min Heap
        PriorityQueue<ListNode> pq =new PriorityQueue<>((a, b) -> a.val - b.val);
        for (int i = 0; i < lists.length; i++)     // Add first node of every list
        {
            if (lists[i] != null) 
            {
                pq.add(lists[i]);
            }
        }       
        ListNode dummy = new ListNode(0);     // Dummy node
        ListNode current = dummy;
        while (!pq.isEmpty())                 // Process heap
        {                
            ListNode smallest = pq.poll();   // Get smallest node
            current.next = smallest;         // Add it to result
            current = current.next;
            if (smallest.next != null)       // Add next node from same list
            {
                pq.add(smallest.next);
            }
        }
        return dummy.next;
    }
}