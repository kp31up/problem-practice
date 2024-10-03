package linkedList;

import exceptions.CustomGlobalException;


public class SinglyLinearLL {

    private Node head;

    static class Node {
        private Node next;
        private int data;
        Node(int data) {
            this.data = data;
        }
    }

    public Node getHead() {
        return this.head;
    }

    public void addFirst(int data) {
        Node nn = new Node(data);
        nn.next = head;
        head = nn;
    }

    public void addLast(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
        } else{
            Node trav = head;
            while(trav.next != null) {
                trav = trav.next;
            }
            trav.next = nn;
        }
    }

    public void displayList() {
        Node trav = head;

        while(trav != null) {
            System.out.print(trav.data + " -> ");
            trav = trav.next;
        }
        System.out.println();
    }

    public void removeLast() throws CustomGlobalException{
        if (head == null)
            throw new CustomGlobalException("List is already empty!");
        if (head.next == null) {
            head = null;
        } else {
            Node trav = head.next;
            Node prev = head;
            while (trav.next != null) {
                prev = prev.next;
                trav = trav.next;
            }
            prev.next = null;
        }
    }

    public void removeAtPos(int pos) throws CustomGlobalException{
        if (head == null)
            throw new CustomGlobalException("List is already empty!");
        if (pos == 0) {
            head = head.next;
        } else {
            Node trav = head.next;
            Node prev = head;
            for (int i =0; i < pos-1; i++) {
                prev = prev.next;
                trav = trav.next;
            }
            if (trav == null) {
                throw new CustomGlobalException("Invalid position!");
            }
            prev.next = trav.next;
        }
    }

    public void removeKey(int key) throws CustomGlobalException {
        if (head == null)
            throw new CustomGlobalException("List is already empty!");
        if (head.data == key)
            head = head.next;
        Node trav = head, prev = head;
        while (trav.next != null) {
            if (trav.data == key)
                break;
            prev = trav;
            trav = trav.next;
        }
        if (trav.next == null) {
            System.out.println("Element not in the List!");
        } else {
            prev.next = trav.next;
        }
    }

    public Node reverseLL(Node  head) {
        Node prev = null, curr = head, next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }

    static void printListUsingNode(Node node) {
        while(node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
    }

}

