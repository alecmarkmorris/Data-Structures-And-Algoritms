package Stack;

import java.util.Stack;

public class Main{
    public static void main(String[] args){
        
        //stack =  LIFO data structure, Last-In First-out
        //         stored objects into a sort of "Vertical Tower"
        //         Last element added to the stack will be the first element removed from the stack
        //         push() - adds element to the top of the stack
        //         pop() - removes element from the top of the stack
        //         peek() - takes a look at the top of the stack without removing it
        //         isEmpty() - checks if the stack is empty
        //         search() - searches for an element in the stack
        //         size() - returns the number of elements in the stack
        //         clear() - removes all elements from the stack
        //         clone() - creates a copy of the stack
        //         toArray() - returns an array containing all of the elements in the stack
        //         toString() - returns a string representation of the stack
        //         pushAll() - adds all elements from one stack to another
        //         popAll() - removes all elements from one stack to another
        //         pushAndPopAll() - adds all elements from one stack to another and then removes all elements from one stack to another
        //         set() - replaces an element in the stack
        //         get() - returns an element in the stack
        //         remove() - removes an element from the stack
        //         replace() - replaces an element in the stack
        //         removeAll() - removes all elements from the stack
        //         retainAll() - retains all elements from the stack
        //         add() - adds an element to the stack
        //         addAll() - adds all elements to the stack


        //Initilializing new Stack of Strings
        Stack<String> stack = new Stack<String>();

        //Pushing starts from the bottom up
        stack.push("Saw I");            //Bottom of the stack
        stack.push("Saw II");
        stack.push("Good Will Hunting");
        stack.push("The Godfather");
        stack.push("The Dark Knight"); //Top of the stack

        stack.pop(); //Removes the top element of the stack
        stack.pop();
        stack.pop();

        System.out.println(stack.peek()); // Takes a peek at the top of stack Without removing it
        stack.pop();
        String myFavMovie = stack.pop(); // No more elements in the stack

        System.out.println(myFavMovie); // Prints "Saw I" bc it can be assigned to String
        System.out.println(stack);
    }
}

