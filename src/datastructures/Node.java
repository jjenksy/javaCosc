package datastructures;

import java.io.Console;

/**
 * Created by johnjenkins on 6/5/17.
 * Node is the most basic build block for data structures
 * contains a value and a next pointer
 * This class demonstrated a node chain
 */
public class Node {
    public int Value;
    public Node Next;

    public Node() {
    }

    public Node(int value) {
        Value = value;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node next) {
        Next = next;
    }

    public static void PrintList(Node node){
        while(node !=null){
            System.out.print(node.getValue());
            node = node.getNext();//get the node that is stored in the next pointer
        }
    }
    public static void main(String[] args){
        //create 2 nodes without a link
        Node first = new Node(3);
        Node middle = new Node(5);
        first.setNext(middle);//link the first node to the middle
        Node last = new Node(6);
        middle.setNext(last);//set middle node pointer to the next
        PrintList(first);
    }
}
