
public class SwapNodes {
    public ListNode swapNodes(ListNode head, int k) {
      
        
        ListNode currentNode = head;
        int length = 0;
        while(currentNode!=null) {
            length++;
            currentNode = currentNode.next;
        }
        
        ListNode firstNode = null;
        ListNode lastNode = null;
        currentNode = head;
        for(int i=1;i<=length-1;i++) {
            if(i == k) {
                firstNode = currentNode;
            } else if(i == (length+1) - k) {
                lastNode = currentNode;
            }
            currentNode = currentNode.next;
        }
        int temp = firstNode.val;
        firstNode.val = lastNode.val;
        lastNode.val = temp;
        return head;
    }


}
