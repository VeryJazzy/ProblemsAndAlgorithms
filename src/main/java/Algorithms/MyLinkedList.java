package Algorithms;

public class MyLinkedList {
    Node head; // head of list


    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }

        public Node getNext() {
            return next;
        }
    }
}
