package cs3.assignment1.assignment7;

public interface MyList<E> extends Iterable<E> {

    /**
     * Add an element to the top of the list
     * @param e
     */
    public void add(E e);

    /**
     * Check if the list is empty
     * @return
     */
    boolean isEmpty();

    /** Add a new element at the specified index in this list */
    public void add(int index, E e);

    /** Return true if this list contains the element */
    public boolean contains(E e);

    /** Return the element from this list at the specified index */
    public E get(int index);

    /** Return the index of the first matching element in this list.
     *  Return -1 if no match.
     * @param e
     * @return
     */
    public int indexOf(E e);

    /** Remove the first occurrence of the element e from this list.
          *  Shift any subsequent elements to the left.
         *  Return true if the element is removed. */
    public boolean remove(E e);


    /** Remove the element at the specified position in this list.
     *  * Shift any subsequent elements to the left.
     * Return the element that was removed from the list. */
    public E remove(int index);

    /** Replace the element at the specified position in this list
     *  * with the specified element and return the old element. */
    public Object set(int index, E e);

    /** Return the number of elements in this list */
    public int size();

    /** Return true if this list contains the element */
    void clear();
}
