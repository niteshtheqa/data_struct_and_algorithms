package linkedlist;

public class SinglyLinkedList {

    private ListNode head;

    // Create ListNode class and initialize values
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.println("Data: " + current.data);
            current = current.next;
        }
        System.out.print("null\n");
    }

    public int size() {

        ListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;

        }
        return count;
    }

    public void addFirst(int data) {

        ListNode newNode = new ListNode(data);
        while (newNode.next == null) {
            newNode.next = head;
            head = newNode;
        }

    }

    public void addLast(int data) {
        ListNode current = head;
        ListNode newNode = new ListNode(data);

        if (current.next == null) {
            current.next = newNode;
            head = newNode;
        }

    }

    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        obj.head = new ListNode(10);
        ListNode second = new ListNode(15);
        ListNode third = new ListNode(20);
        ListNode fourth = new ListNode(25);

        obj.head.next = second;
        second.next = third;
        third.next = fourth;

        obj.display();

        System.out.println("\n\n\nSize of Singly Linked List: " + obj.size());

        obj.addFirst(50);

        obj.display();

        obj.addLast(60);

        obj.display();

    }

}