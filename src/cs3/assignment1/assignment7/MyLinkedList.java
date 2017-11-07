package cs3.assignment1.assignment7;

/**
 *  *  * Instructor: Jing Zhang, PhD
 * Programming Assignment 2 Exercise 2
 * Created by John Jenkins on 10/20/17.
 * The implementation of the methods contains(E e), get(int index), indexOf(E e),
 * lastIndexOf(E e), and set(int index, E e) for MylinkedList were omitted from the textbook
 * (Listing 24.6, page 916-918). Based on the contains(E e) and indexOf(E e) given below, please
 * implement get(int index), lastIndexOf(E e), and set(int index, E e).
 */
public class MyLinkedList<E> extends MyAbstractList<E> {

    private Node<E> head, tail;

    public MyLinkedList() {
    }

    public MyLinkedList(E[] objects) {
        super(objects);
    }

    /** Return the head element in the list */
    public E getFirst() {
        if(size == 0) return null;
        return head.element;
    }

    /** Return the last element in the list */
    public E getLast(){
        if (size == 0) return null;
        return tail.element;
    }

    /** Add an element to the beginning of the list */
    public void addFirst(E e) {
        // Implemented in Section 24.4.3.1, so omitted here
        Node<E> newNode = new Node<>(e); // Create a new node
        newNode.next = head; // link the new node with the head
        head = newNode; // head points to the new node
        size++; // Increase list size
        if (tail == null) // The new node is the only node in list
            tail = head;
    }

    /** Add an element to the end of the list */
    public void addLast(E e){
        Node<E> newNode = new Node<>(e); // Create a new node for e
        if (tail == null) {
            head = tail = newNode; // The only node in list
        }
        else {
            tail.next = newNode; // Link the new node with the last node
            tail = tail.next; // tail now points to the last node
        }
        size++; // Increase size
    }

    /** Remove the head node and
     * return the object that is contained in the removed node. */
     public E removeFirst() {
         // Implemented in Section 24.4.3.4, so omitted here
         if (size == 0) return null; // Nothing to delete
         else {
             Node<E> temp = head; // Keep the first node temporarily
             head = head.next; // Move head to point to next node
             size--; // Reduce size by 1
             if (head == null) tail = null; // List becomes empty
             return temp.element; // Return the deleted element
         }
     }

    @Override
    public void add(int index, E e) {
        if (index == 0) addFirst(e); // Insert first
        else if (index >= size) addLast(e); // Insert last
        else { // Insert in the middle
            Node<E> current = head;
            for (int i = 1; i < index; i++)
                current = current.next;
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            (current.next).next = temp;
            size++;
        }
    }

    /** Remove the last node and
     * return the object that is contained in the removed node. */
     public E removeLast() {
         if (size == 0) return null; // Nothing to remove
         else if (size == 1) { // Only one element in the list
             Node<E> temp = head;
             head = tail = null; // list becomes empty
             size = 0;
             return temp.element;
         }
         else {
             Node<E> current = head;
             for (int i = 0; i < size - 2; i++)
                 current = current.next;

             Node<E> temp = tail;
             tail = current;
             tail.next = null;
             size--;
             return temp.element;
         }
     }

    public boolean contains(Object o) {
        // Implement it in this exercise
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(o))
                return true;
            current = current.next;
        }
        return false;
    }
    /** Returns the index of the first matching element in this list.
     * Returns -1 if no match. */
    public int indexOf(Object o) {
        // Implement it in this exercise
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(o))
                return i;
            current = current.next;
        }
        return -1;
    }
    /** Returns the index of the last matching element in this list
     * Returns -1 if no match. */
    public int lastIndexOf(Object o) {
        // Your code here!
        int last = -1;
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(o)){
                last = i;
            }
            current = current.next;
        }
        return last;
    }
    /** Replace the element at the specified position in this list
     * with the specified element. */
    public E set(int index, E e) {
        // Your code here!
        // Implement it in this exercise
        if (index < 0 || index >= size) return null; // Out of range
        else if (index == 0) {
            return head.element = e;
        }
        else if (index == size - 1) {
            return tail.element = e;
        } // Remove last
        else {
            Node<E> previous = head;

            for (int i = 1; i <= index; i++) {
                previous = previous.next;
            }
           return previous.element = e;
        }
    }

    /** Return the element from this list at the specified index */
    public E get(int index) {
        if (index < 0 || index >= size) return null; // Out of range
        else if (index == 0) return removeFirst(); // Remove first
        else if (index == size - 1) return removeLast(); // Remove last
        else {
            Node<E> previous = head;

            for (int i = 1; i <= index; i++) {
                previous = previous.next;
            }
            return previous.element;
        }

    }


    @Override
    public E remove(int index) {
        // Implemented earlier in Section 24.4.3.6, so omitted here
        if (index < 0 || index >= size) return null; // Out of range
        else if (index == 0) return removeFirst(); // Remove first
        else if (index == size - 1) return removeLast(); // Remove last
        else {
            Node<E> previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }

    @Override
    public void clear() {
        size = 0;
        head = tail = null;
    }

    @Override
     public String toString() {
            StringBuilder result = new StringBuilder("[");

            Node<E> current = head;
         for (int i = 0; i < size; i++) {
             result.append(current.element);
             current = current.next;
             if (current != null) {
                 result.append(", "); // Separate two elements with a comma
                 }
             else {
                 result.append("]"); // Insert the closing ] in the string
                 }
             }

         return result.toString();
    }

    @Override /** Override iterator() defined in Iterable */
     public java.util.Iterator<E> iterator() {
         return new LinkedListIterator();
    }
        private class LinkedListIterator implements java.util.Iterator<E> {
         private Node<E> current = head; // Current index
             @Override
             public boolean hasNext() {
                 return (current != null);
             }

             @Override
             public E next() {
                 E e = current.element;
                 current = current.next;
                 return e;
             }

             @Override
             public void remove() {
                 System.out.println("Implementation left as an exercise");
             }
     }

    private class Node<E> {
        E element;
        Node<E> next;
        public Node(E e) {
            element = e;
        }
    }

    public static void main(String[] args){
         MyLinkedList<String> myLinkedList = new MyLinkedList<>();

         myLinkedList.add("hello");
         myLinkedList.add("test");
         myLinkedList.add("test5");
         myLinkedList.add("test3");
         myLinkedList.add("test4");
         myLinkedList.add("test5");

         myLinkedList.add("test5");

        for (String s: myLinkedList) System.out.print(s + " ");
        System.out.println();
        System.out.println(myLinkedList.get(4));
        System.out.println(myLinkedList.set(4,"changed"));
        for (String s: myLinkedList) System.out.print(s + " ");
        System.out.println();
        System.out.println(myLinkedList.lastIndexOf("test3"));
    }
}


