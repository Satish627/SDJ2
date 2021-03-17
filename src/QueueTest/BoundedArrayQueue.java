package QueueTest;

import java.util.ArrayList;

public class BoundedArrayQueue<String> implements QueueADT<String>{
    private  ArrayList<String> list;

    public BoundedArrayQueue(){
        list= new ArrayList<>();
    }
    @Override
    public void enqueue(String element) {
        list.add(element);
    }
    @Override
    public String first() {
        if (list.isEmpty()) throw new IllegalArgumentException ("Queue is empty.");

        return list.get(0);
    }
    @Override
    public int size() {
        return list.size();
    }
    @Override
    public String dequeue() {
        if (list.isEmpty()) throw new IllegalArgumentException ("Queue is empty.");
        return list.remove(0);
    }
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int indexOf(String element) {
        return list.indexOf(element);
    }

    @Override
    public boolean contains(String element) {
        return list.contains(element);
}}

