package datastructures;

import java.util.Collections;

/**
 * Created by johnjenkins on 6/5/17.
 */
public class LinkedListTest<T> {

    //head of the Linked list
    private LinkedListNode<T> Head;
    //tail of the linked list
    private LinkedListNode<T> Tail;
    private int Count;


    public LinkedListNode<T> getHead() {
        return Head;
    }

    public void setHead(LinkedListNode<T> head) {
        Head = head;
    }

    public LinkedListNode<T> getTail() {
        return Tail;
    }

    public void setTail(LinkedListNode<T> tail) {
        Tail = tail;
    }

    //adds the specified value to the start of the linked list
    public void AddFirst(T value){
        //we create the node if only a value is added
        AddFirst(new LinkedListNode<>(value));
    }

    //adds the specified node to the start of the linked list
    public void AddFirst(LinkedListNode<T> linkedListNode) {
        //save off the head node so we do not lose it
        LinkedListNode<T> temp = Head;

        //point head to the new node
        Head = linkedListNode;

        //insert the rest of the list behind the head
        Head.setNext(temp);
        Count++;

        if(Count == 1){
            //if there is only one item then tail
            Tail = Head;
        }
    }

    //adds the specified value to the end of the linked list
    public void AddLast(T value){
        AddLast(new LinkedListNode<T>(value));
    }

    public void AddLast(LinkedListNode<T> linkedListNode) {
        if(Count == 0){
            Head = linkedListNode;
        }else {
            Tail.setNext(linkedListNode);
        }

        Tail = linkedListNode;
        Count++;
    }

    //remove the first element
    public void RemoveFirst(){
        if(Count !=0){
            //set tje head to the next node
            setHead(Head.getNext());
        }
        if(Count ==0){
            Tail = null;
        }
    }

    //remove the last node in the list
    public void RemoveLast(){
        if(Count != 0){
            if(Count == 1){
                Head = null;
                Tail = null;
            }else {
                LinkedListNode<T> current = Head;
                while (current.getNext() != Tail){
                    current = current.getNext();
                }

                current.setNext(null);
                Tail = current;
            }

            Count--;
        }
    }

}
