package linkedList;

import exceptions.CustomGlobalException;

import java.util.logging.Logger;

import static linkedList.SinglyLinearLL.printListUsingNode;

public class LinkedListMain {
    static Logger log = Logger.getLogger(SinglyLinearLL.class.getName());

    public static void main(String[] args) {
        SinglyLinearLL ll = new SinglyLinearLL();
        try {
            ll.addFirst(3);
            ll.addFirst(5);
            ll.addFirst(8);
            ll.addLast(1);
            ll.displayList();

            ll.addLast(2);
            ll.addLast(1);
            ll.displayList();

            ll.removeKey(1);
            System.out.print("List after removing key: ");
            ll.displayList();

            ll.removeLast();
            ll.displayList();

            ll.removeAtPos(2);
            ll.displayList();

            System.out.print("List after reversing: ");
            SinglyLinearLL.Node newHead = ll.reverseLL(ll.getHead());
            printListUsingNode(newHead);

        } catch (CustomGlobalException e) {
            log.severe("Exception occurred: "+ e.getMessage());
        }
    }
}
