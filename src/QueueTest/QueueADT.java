package QueueTest;

 interface QueueADT<String> {

     void enqueue(String element);
     String dequeue();
    String first();
     int size();
     boolean isEmpty();
     int indexOf(String element);
   boolean contains(String element);
}

