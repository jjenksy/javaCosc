package datastructures;

import java.util.ArrayList;

/**
 * Created by johnjenkins on 6/7/17.
 * A queue is a collection the items are checked out in the order that
 * they were added like a line at a grocery store
 */
public class Queue<T> {

    private ArrayList<T> _list;

    public Queue(ArrayList<T> _list) {
        this._list = _list;
    }

    //add an item
    public void Enqueue(T item){
        _list.add(item);
    }

    //remove and item
    public void Dequeue(){
        _list.remove(0);
    }


    //peek at the first item an do not remove
    public T peek(){

        return _list.get(0);
    }




    public static void main(String[] args){
        Queue<Integer> integerQueue = new Queue<>(new ArrayList<>());
        for(int i=0;i<100;i++){
            integerQueue.Enqueue((int)(Math.random()*i));
        }



        System.out.println(integerQueue.peek());
        integerQueue.Dequeue();
        System.out.println(integerQueue.peek());
        System.out.println(integerQueue.peek());
        integerQueue.Dequeue();
        System.out.println(integerQueue.peek());
        System.out.println(integerQueue.peek());
        integerQueue.Dequeue();
        System.out.println(integerQueue.peek());
        System.out.println(integerQueue.peek());
        integerQueue.Dequeue();
        System.out.println(integerQueue.peek());
        System.out.println(integerQueue.peek());
        integerQueue.Dequeue();
        System.out.println(integerQueue.peek());
        System.out.println(integerQueue.peek());
        integerQueue.Dequeue();
        System.out.println(integerQueue.peek());
        System.out.println(integerQueue.peek());
        integerQueue.Dequeue();
        System.out.println(integerQueue.peek());
        System.out.println(integerQueue.peek());
        integerQueue.Dequeue();
        System.out.println(integerQueue.peek());
        System.out.println(integerQueue.peek());
        integerQueue.Dequeue();
        System.out.println(integerQueue.peek());
        System.out.println(integerQueue.peek());
        integerQueue.Dequeue();
        System.out.println(integerQueue.peek());
        System.out.println(integerQueue.peek());
        integerQueue.Dequeue();
        System.out.println(integerQueue.peek());
        System.out.println(integerQueue.peek());
        integerQueue.Dequeue();
        System.out.println(integerQueue.peek());


    }
}
