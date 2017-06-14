/* To better understand Message Spaces and Cipher Spaces, we will first explain the alphabet of definitions.
denotes a finite set called the alphabet of definition. For example, is the binary alphabet. It is a frequently used alphabet of definition.
denotes a set called message space. consists of strings composed of symbols from an alphabet of definition.
denotes a set called the ciphertext space. consists of strings composed of symbols from an alphabet of definition which might or might not differ from that of .
For example, consider the following encryption: You get a message composed of lowercase English characters only. For any letter in the message, you shift it one time and create a new message that you then transmit. If you get "" then you transform it to "".
Here, is '', '', '', ... , ''.
Both and are sets of all strings composed of lowercase English characters.
For example:
and
(corresponding to the strings in )
For every possible string in , there is a string in .
In this task, your alphabet of definition is .
and are both sets of all strings consisting of decimal digits. Given a coded message, you need to find the new message you obtain if you shift each digit in the message string. You must shift to the right, and it is cyclic.
Constraints
Length of the string
Input Format
Input consists of a single line that contains the string.
Output Format
Output a single line, the shifted string.
Sample Input
982
Sample Output
093
*/

import java.io.*;
import java.util.*;
/* A = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9} */
/* M = {Input} */
/* C = {Output} */
public class Solution {

    public static void main(String[] args) {
        int[] numbers;
        String[] strings;
        Scanner sc;
        String input;
        CircularLinkedList cLL;
        
        sc = new Scanner(System.in);
        input = sc.next();
        string = input.split("");
        
        cLL = new CircularLinkedList();
        
        for (int i = 0; i < strings )
        {
            
        }
    }
    
    /* Lets use a circular linked list to solve this problem! */
    class Node
    {
        public Node(int data)
        {
            this.data = data;
        }
        
        int data;
        Node next;
    }
    
    class CircularLinkedList
    {
    	
    	  public CircularLinkedList()
    	  {
    	  	  int x;
    	  	  Node node;
    	  	  
    	  	  start = new Node(0);
    	  	  x = 1;
    	  	  node = start;
    	  	  
    	  	  while (x < 10)
    	  	  {
    	  	  	 if (node.data < 9)
                 {
                     node.next = new Node(x);
                     node = node.next;
                     x++;
                     
                 } else
                 {
                     last = new Node(x);
                     last.next = start;
                 }

    	  	  }
    	  }
    	  
        /* An easy access point to the CircularLinkedList */
        Node start;
        
        /* This reference is used to bind the head to the tail,
         * which completes that circle
         */
        Node last;
        
        /* Go into the list and search for the node holding the target
         * data. Return the reference to that node.
         */
        public int nextInt(int integer)
        {
        	Node node = start;
        	  
            while (true)
            {
            	 if (node.data == integer)
            	 {
            	 	  return node.next.data;
            	 }
                
            	 node = node.next;
            }
        }
    }
}



