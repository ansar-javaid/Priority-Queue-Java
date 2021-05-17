package com.Ansar;


import com.Ansar.PriorityQueueLinked.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PriorityQueue<String> list=new PriorityQueue<>();
        System.out.println(list.Size());
        list.enqueue(100,"Ansar Jawed");
        list.enqueue(13,"Ansar-0");
        list.enqueue(18,"Ansar-1");
        list.enqueue(12,"Ansar-2");
        list.enqueue(25,"Ansar-3");
        list.enqueue(40,"Ansar-4");
        System.out.println(list.Size());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());



    }
}
