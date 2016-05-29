/*
Stephanie Z.
I didn't have as much trouble as expected while making the code though I did run
into some problems. I originally had forgotten about how the two data structures
differ in organization (LIFO, FIFO) so I could not figure out why queue wasn't 
working. I ended up adding the string to the queue in a backwards order. After, 
I made sure to empty the stack and queue and repeat the process this time making
sure the strings would not go into the same data structure. Perhaps if I were
to redo this code now that I am familiar with the workings of stack and queue
I would implement a switch function or create class functions in Main to clean
up the code, there's way too many if statements!
 */
package palindrome;
import java.util.Scanner;
/**
 *
 * @author Stephanie Zendejo
 */
public class Main {

    public static void main(String[] args) {
        int counter=0;
        int string1length;
        int string2length;
        String string1reverse = "";
        String string2reverse = "";
        String reversetemp = "";
        Scanner input = new Scanner(System.in);        
        ListStack stack = new ListStack();
        ListQueue queue = new ListQueue();
        
        System.out.print("Enter first string: ");
        String string1 = input.nextLine();
        System.out.print("Enter second string: ");
        String string2 = input.nextLine();  
        string1length = string1.length();
        string2length = string2.length();
        for(int i=0; i< string1length; i++) {
            stack.push(string1.charAt(i));
        }
        for(int i=string2length-1; i>=0; i--) {
            queue.enqueue(string2.charAt(i));
        }
        while(!stack.isEmpty()) {
            string1reverse = string1reverse + stack.topAndPop();
        }
        while(!queue.isEmpty()) {
            string2reverse = string2reverse + queue.dequeue();
        }
        if(string1.equals(string1reverse))
            System.out.println("String 1 is a palindrome.");
        else
            System.out.println("String 1 is not a palindrome.");
           counter++;
        if(string2.equals(string2reverse))
            System.out.println("String 2 is a palindrome.");
        else
            System.out.println("String 2 is not a palindrome.");
           counter++;
        if(string1length != string2length) {
            System.out.println("These strings are of different lengths.");   
            System.exit(0);
        }     
        stack.makeEmpty();
        queue.makeEmpty();
        string1reverse = "";
        string2reverse = "";
        if(counter==2){
            for(int i=string1length-1; i>=0; i--) {
            queue.enqueue(string1.charAt(i));
            }
            for(int i=0; i< string2length; i++) {
            stack.push(string2.charAt(i));
            }
            while(!queue.isEmpty()) {
            string1reverse = string1reverse + queue.dequeue();
            }
            while(!stack.isEmpty()) {
            string2reverse = string2reverse + stack.topAndPop();
            }
            for(int i=string1reverse.length()-1; i>=0; i--) {
            reversetemp = reversetemp + string1reverse.charAt(i);   
            }
            if(string2reverse.equals(reversetemp)) {
            System.out.println("The strings are reverses of each other");                
            }
        }
            
    }
    
}
