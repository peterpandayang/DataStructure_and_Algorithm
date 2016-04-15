package MergeKSortedLists;
import java.util.List;
/**
 * Created by bingkunyang on 16/1/1.
 */
class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
        next = null;

    }
}
public class Solution {
    /**
     * @param lists: a list of ListNode
     * @return: The head of one sorted list.
     */
    public ListNode mergeKLists(List<ListNode> lists) {
        // write your code here
        if (lists.isEmpty()) return null;

        int end = lists.size() - 1;
        while(end > 0){
            int begin = 0;
            while (begin < end){
                lists.set(begin, mergeTwoLists(lists.get(begin), lists.get(end)));
                begin ++;
                end --;
            }
        }
        return lists.get(0);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode dummyNode = new ListNode(0);
        ListNode p = dummyNode;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                p.next = l1;
                l1 = l1.next;
            }
            else{
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return dummyNode.next;
    }
}
