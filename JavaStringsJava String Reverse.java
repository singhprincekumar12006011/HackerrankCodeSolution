/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int ptr = A.length()-1;
        int start=0;
        while (start < ptr )
        {
            if(A.charAt(start) != A.charAt(ptr))
            {
                System.out.println("No");
                return;
            }
            start++;
            ptr--;
        }
        System.out.println("Yes");
        
        
        
        
    }
}



