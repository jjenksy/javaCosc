package cs3.assignment1.assignment7;

import java.util.Arrays;
import java.util.Iterator;

/**
 *  * Instructor: Jing Zhang, PhD
 * Programming Assignment 2 Exercise 1
 * Created by John Jenkins on 10/20/17.
 * /** Adds the elements in otherList to this list.
 * Returns true if this list changed as a result of the call
 * public boolean addAll(MyList<E> otherList);
/** Removes all the elements in otherList from this list
 * Returns true if this list changed as a result of the call
 * public boolean removeAll(MyList<E> otherList);
/** Retains the elements in this list that are also in otherList
 * Returns true if this list changed as a result of the call
 * public boolean retainAll(MyList<E> otherList);
 * @param <E>
 */
public class MyArrayList <E> extends MyAbstractList<E> {

    public static final int INITIAL_CAPACITY = 16; //initial capacity
    private E[] data = (E[]) new Object[INITIAL_CAPACITY]; //create an array with the initial capacity

    /**
     * No arg contructor
     */
    public MyArrayList() {
    }

    public MyArrayList(E[] objects) {
        for (int i = 0; i < objects.length ; i++) {
            add(objects[i]);
        }
    }

    @Override
    public void add(int index, E e) {
        ensureCapacity();
        for (int i = size -1; i >= index; i--) {
            data[i+1] = data[i];
        }

        // Insert new element to data[index]
        data[index] = e;
        //increase the size +1
        size++;
    }

    /**
     * Create a new array double the capacity of the old
     */
    private void ensureCapacity() {
        if(size >= data.length){
            E[] newData = (E[])(new Object[size * 2 + 1]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    @Override /** clear the list **/
    public void clear() {
        data = (E[])new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override/** Return true if this list contains the element */
    public boolean contains(E e) {
        for (int i = 0; i < size; i++){
            if (e.equals(data[i])) return true;
        }
        return false;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }


    @Override/** Return the index of the last matching element * in this list. Return -1 if no match. */
    public int indexOf(E e) {
        for (int i = size - 1; i >= 0; i--){
            if (e.equals(data[i])) return i;
        }
        return -1;
    }

    /** Remove the element at the specified position
     * in this list. Shift any subsequent elements to the left.
     * Return the element that was removed from the list.
     * @param index
     * @return
     */

    @Override
    public E remove(int index) {
        checkIndex(index);

        E e = data[index];

        //shift the data left
        for (int j = index; j < size - 1; j++){
            data[j] = data[j + 1];
        }
        data[size - 1] = null; // This element is now null
        size--;
        return e;
    }

    @Override
    public E set(int index, E e) {
        checkIndex(index);
        E old = data[index];
        data[index] = e;
        return old;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "data=" + Arrays.toString(data) +
                '}';
    }

    /** Trims the capacity to current size */
    public void trimToSize() {
        if(size != data.length){
            E[] newData = (E[])(new Object[size]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    /** Adds the elements in otherList to this list.
     * Returns true if this list changed as a result of the call */
    public boolean addAll(MyList<E> otherList) {
        for (int i = 0; i < otherList.size(); i++)
            add(otherList.get(i));

        if (otherList.size() > 0)
            return true;
        else
            return false;
    }

    /**
     * Removes all the elements in otherList from this list Returns true if this
     * list changed as a result of the call
     */
    public boolean removeAll(MyList<E> otherList) {
        boolean result = false;
        for (E e : otherList) {
            while (remove(e)) {
                if (!result) {
                    result = true;
                }
            }
        }
        return result;
    }

    /**
     * Retains the elements in this list that are also in otherList Returns true
     * if this list changed as a result of the call
     */
    public boolean retainAll(MyList<E> otherList) {
        boolean result = false;
        for (int i = 0; i < size(); i++) {
            E e = get(i);
            if (otherList.indexOf(e) < 0) {
                remove(e);
                i--;
            }
        }
        return result;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<E> {
        private int current = 0; // Current index
        @Override
        public void remove() {
            MyArrayList.this.remove(current);
        }

        @Override
        public boolean hasNext() {
            return (current < size);
        }

        @Override
        public E next() {
            return data[current++];
        }
    }

    public static void main(String[] strings){
        MyArrayList<String> list = new MyArrayList<>();
        MyArrayList<String> list2 = new MyArrayList<>();
        list2.add("Britain");
        list2.add("Italy");

        // Add elements to the list list.add("America"); // Add it to the list System.out.println("(1) " + list);
        list.add(0, "Canada"); // Add it to the beginning of the list System.out.println("(2) " + list);
        list.add("Russia"); // Add it to the end of the list System.out.println("(3) " + list);
        list.add("France"); // Add it to the end of the list System.out.println("(4) " + list);
        list.add(2, "Germany"); // Add it to the list at index 2 System.out.println("(5) " + list);
        list.add(5, "Norway"); // Add it to the list at index 5 System.out.println("(6) " + list);
// Remove elements from the list
        list.remove("Canada"); // Same as list.remove(0) in this case System.out.println("(7) " + list);
        list.remove(2); // Remove the element at index 2 System.out.println("(8) " + list);
        list.remove(list.size() - 1); // Remove the last element System.out.print("(9) " + list + "\n(10) ");
        list.addAll(list2);

        for (String s: list) System.out.print(s.toUpperCase() + " ");
        System.out.println();
        list.removeAll(list2);
        list2.add("GERMANY");
        for (String s: list) System.out.print(s.toUpperCase() + " ");
        list.retainAll(list2);
        System.out.println();
        for (String s: list) System.out.print(s.toUpperCase() + " ");

    }
}
