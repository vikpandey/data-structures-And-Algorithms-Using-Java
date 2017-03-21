package linkedList;

import java.util.ArrayList;

/**
 * Created by vikas on 11/9/16.
 */
public class ReverseLinkedList {

    public static void main(String[] args) {

        ListNode head = null;
        reverseLinkedList(head);

    }

    public static ListNode reverseLinkedList(ListNode head) {

        if(head == null)
            return null;
        if(head.getNext() == null)
            return head;

        ListNode current, previous, nextNode;
        previous = null;
        current = head;
        nextNode = null;


        while(current != null) {

            nextNode = current.getNext();
            current.setNext(previous);
            previous = current;
            current = nextNode;
        }

        head = previous;
        return  head;
    }

}
