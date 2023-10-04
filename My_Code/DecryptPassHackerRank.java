/* 

In a computer security course, you just learned about password decryption. 
Your fellow student has created their own password encryption method, and they've asked you to test how secure it is. 
Your task is to recover the original password given the encrypted password provided to you by your classmate.

At first, it seems impossible. But one day after class, you catch a peek of your classmate's notebook where the encryption process is noted. 
You snap a quick picture of it to reference later. It says this:

Given string s, let s[i] represent the th character in the string s, using 0-based indexing,

1. Initially i = 0.

2. If s[i] is lowercase and the next character s[i+1] is uppercase, swap them, add a '*' after them, and move to i+2.

3. If s[i] is a number, replace it with O, place the original number at the start, and move to i+1.

4. Else, move to i+1.

5. Stop if i is more than or equal to the string length. Otherwise, go to step 2.

A There's even an example mentioned in the notebook. When encrypted, the string "hAck3rr4nk" becomes "43Ah*ckOrrOnk". 
(Note: the original string, "hAck3rr4nk", does not contain the character 0.)

Note:

The original string always contains digits from 1 to 9 and does not contain 0.

The original string always contains only alpha-numeric characters.

Using this information, your task is to determine the original password (before encryption) when given the encrypted password from your classmate.

Function Description

Complete the function decryptPassword in the editor below. 
decryptPassword must return the original password string before it was encrypted by your classmate.

decryptPassword has the following parameter:

s: the password string after it was encrypted by your classmate


*/

import java.util.Stack;

public class DecryptPassHackerRank {
    public static void main(String[] args) {
        // String encryptedPassword = "11Hello00";
        String encryptedPassword = "3Po*0Np";
        System.out.println(decryptPassword(encryptedPassword));
    }

 
    static String decryptPassword(String s){
        StringBuilder original = new StringBuilder(s);
        StringBuilder decrypted = new StringBuilder();
        int i=0;
        // Default initialization of Stack
        Stack<String> stack1 = new Stack<String>();
        
        while(i<original.length()){
            if(original.charAt(i)=='*'){
                decrypted.append(stack1.pop());
                decrypted.append(stack1.pop());
            }else if(original.charAt(i)=='0'){
                String poppedVal = "A";
                StringBuilder tmp = new StringBuilder();
                while(!stack1.isEmpty()){
                        poppedVal = stack1.pop();
                    if(!Character.isDigit(poppedVal.charAt(0))){
                        tmp.append(poppedVal);
                        // System.out.println("poppedVal = "+ poppedVal);
                    }else{
                        decrypted.append(tmp.reverse().toString());
                        decrypted.append(poppedVal);
                        break;
                    }
                }
                // decrypted.append(poppedVal);
                // System.out.println("Stack 1 = "+ stack1);
                // System.out.println("decrypted2 = "+decrypted);
            }else{
                stack1.push(String.valueOf(original.charAt(i)));
            }
            i++; // Move to i+1
        }
        StringBuilder tmp = new StringBuilder();
        // Pop elements from the stack
        while(!stack1.isEmpty()) {
            tmp.append(stack1.pop());
        }
        decrypted.append(tmp.reverse().toString());
        return decrypted.toString();    
    }
}