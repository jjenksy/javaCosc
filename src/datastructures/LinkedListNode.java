package datastructures;

/**
 * Created by johnjenkins on 6/5/17.
 * LinkListNode uses generics so we can use any type
 */
public class LinkedListNode<T> {

    private T Value;//the node value
    private LinkedListNode<T> Next;//the next node in the linked list (null if the last node)

    //constructs a new node with the specified value
    public LinkedListNode(T value) {
        Value = value;
    }

    public T getValue() {
        return Value;
    }

    public void setValue(T value) {
        Value = value;
    }

    public LinkedListNode<T> getNext() {
        return Next;
    }

    public void setNext(LinkedListNode<T> next) {
        Next = next;
    }
}
