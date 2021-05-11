package Algorithms;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
    //You are given two non-empty linked lists representing two non-negative integers.
    // The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
    //You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    public static void main(String[] args) {
        AddTwoNumbers main = new AddTwoNumbers();
        main.doTheThing();
    }

    public void doTheThing() {
        ListNode answer = addTwoNumbers(new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9
                        , new ListNode(9, new ListNode(9, new ListNode(9)))))))))),
                new ListNode(5, new ListNode(4)));
        System.out.println(readListNode(answer));

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String number1 = readListNode(l1);
        String number2 = readListNode(l2);

        BigInteger answerP1 = new BigInteger(number1);
        BigInteger answerP2 = new BigInteger(number2);
        BigInteger answer = answerP1.add(answerP2);

        StringBuilder rev = new StringBuilder(answer.toString());
        String answerReversed = rev.reverse().toString();


        //i have "345" (543)
        //i need node(3, new node(4, new node(5)))

        List<ListNode> listOfNodes = new ArrayList<ListNode>();

        for (char c : answerReversed.toCharArray()) {
            int currentInt = Character.getNumericValue(c) ;
            listOfNodes.add(new ListNode(currentInt));
        }

        //now we just need to join the nodes

        ListNode complete = listOfNodes.get(0);
        ListNode current = complete;

        for (int i=1; i < listOfNodes.size(); i++) {
            current.next = listOfNodes.get(i);
            current = current.next;
        }


        return complete;
    }

    public static String readListNode(ListNode node) {
        StringBuilder number = new StringBuilder();

        while (true) {
            if (node == null) {
                break;
            }
            number.append(Integer.toString(node.val));
            node = node.next;
        }

        return number.reverse().toString();
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}