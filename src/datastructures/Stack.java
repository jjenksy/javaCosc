package datastructures;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by johnjenkins on 6/6/17.
 * Stack class implementing the first in last out data structure
 */
public class Stack<T> {

    private LinkedList<T> _list;


    //default init contructor
    public Stack(LinkedList<T> _list) {
        this._list = _list;
    }

    //add an item to the stack
    public void Push(T item){
        _list.add(item);
    }

    //removes an item

    public T Pop() throws Exception {
        if(_list.size() ==0){
            throw new Exception("The stack is empty");
        }
        T value = _list.getFirst();
        _list.removeFirst();
        return value;
    }


    //see item but do not remove
    public T Peek() throws Exception {
        if(_list.size() ==0){
            throw new Exception("The stack is empty");
        }
        T value = _list.getFirst();
        return value;
    }


    //get the num items
    public int Count(){
        return _list.size();
    }

    //clear the list
    public void Clear(){
        _list.clear();
    }

    //enumerates the stack
    public ListIterator<T> getEnumerRator(){
        return _list.listIterator();
    }


    public static void main(String[] args){
        Stack<Integer> integerStack = new Stack<>(new LinkedList<>());
        for(int i =0; i<100; i++){
            integerStack.Push((int) (Math.random()*10));
        }

        System.out.println(integerStack.Count());
        while(integerStack.getEnumerRator().hasNext()){
            try {
                System.out.println(integerStack.Pop());
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        System.out.println(integerStack.Count());
    }

}
