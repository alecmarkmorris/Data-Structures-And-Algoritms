package LinkedLists;

public class LinkedList {

    public static void main(String[] args) {

        //LinkedList = stored nodes in 2 parts (data + address)
        //              Nodes are non-consequetive memory locations
        //              Each node contains data and a reference to the next node
        //              First node is called the Head
        //              Last node is called the Tail

        //Initializing new linked list
    java.util.LinkedList<String> linkedList = new java.util.LinkedList<String>();

    linkedList.offer("A"); //Head of linked list
    linkedList.offer("B");
    linkedList.offer("C");
    linkedList.offer("D");
    linkedList.offer("F"); // Tail of linked list

    System.out.println(linkedList); //Printing linked list 

    linkedList.add(4, "E"); //Inserting element at index 4 (index starts at 0)

    System.out.println(linkedList); // Printing after adding E

    linkedList.remove("E"); //Removing element at index 4

    System.out.println(linkedList);

    System.out.println("Index of C is: " + linkedList.indexOf("C"));

    //Peek without removing or changing LinkedList
    System.out.println(linkedList.peekFirst()); // Peak first   
    System.out.println(linkedList.peekLast()); // Peak last
       

    }
}
