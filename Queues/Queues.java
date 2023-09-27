package Queues;

import java.util.LinkedList;
import java.util.Queue;
public class Queues {
    public static void main(String[] args){

        //Queue = FIFO data structure, First-In First-Out
        //         stored objects into a sort of "Horizontal Tower"
        //         First element added to the queue will be the first element removed from the queue
        //         "Horizontal Tower" is called the "Queue" 
        //         add() - enqueue, offer()
        //         remove() - dequeue, poll()
        //         element() - peek, peek()s
        //         size() - size()
        //          isEmpty() - isEmpty()
        //          contains() - contains()


        //Initializing a new Queue
        Queue<String> queue = new LinkedList<String>();

        //Add elements to Queue
        queue.offer("Karen"); //Front of the queue
        queue.offer("Chad");
        queue.offer("Kyle");
        queue.offer("Jessica"); //End of the queue

        System.out.println(queue);  //Display Queue

        System.out.println(queue.peek()); //Display the first element of the queue;

        System.out.println(queue.poll()); //Remove the first element of the queue;

        System.out.println(queue); //Display Queue

    }
}
