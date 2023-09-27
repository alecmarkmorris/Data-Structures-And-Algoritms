package Queues;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueues {

    public static void main(String[] args){
        
        //Priority Queue = FIFO data structure, First-In First-Out
        //                  stored objects into a sort of "Horizontal Tower"
        //                  First element added to the queue will be the first element removed from the queue
        //                  The elements are sorted in the order that they are added
        
        //Initializing a new Priority Queue
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        //Adding elements to the queue
        queue.offer("F");
        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("D");

        //While queue is not empty poll the DS
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        
    }
}
