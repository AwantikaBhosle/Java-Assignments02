//How to reverse a given String? (solution)
//Write a program to reverse a String in C/Java/Python or choice of your programming language. You can write either the recursive or iterative solution. For example, if a given input is "abcd," then your function should return "dcba".
import java.io.FileNotFoundException;
import java.io.IOException;


public class StringReverseExample {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        
        String str = "\nSony is going to introduce Internet TV soon";
        System.out.println("Original String: " + str);
        String reverseStr = new StringBuffer(str).reverse().toString();
        System.out.println("\nReverse String in Java using StringBuffer: " + reverseStr);
        reverseStr = reverse(str);
        System.out.println("\nReverse String in Java using Iteration: " + reverseStr);
        reverseStr = reverseRecursively(str);
        System.out.println("\nReverse String in Java using Recursion: " + reverseStr);

    }

    public static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();

        for (int i = strChars.length - 1; i >= 0; i--) {
            strBuilder.append(strChars[i]);
        }

        return strBuilder.toString();
    }

    public static String reverseRecursively(String str) {
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }
}