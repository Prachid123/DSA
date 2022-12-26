import java.util.*;

public class duplicatebrackets {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    Stack<Character> stack = new Stack<>(); 
    for (int i = 0; i < str.length(); i++) {
        // for loop to traverse the whole string
        char ch = str.charAt(i);
        // ch to go to each character in the string
       if(ch==')'){ 
        // now chwcking if curr char is closed bracket then we have 
        // ton check if the peek element is open bracket then surepy it is duplicate bracket because no normal char is in between the print 
        // true and then check if the peek element is not open bracket then  use while loop and pop the elements of string till we gwt pwwk element as
        // open bracket as soon as we get open bracket again pop the element because we alsohave to remove the open bracket fron the string.
        // and else if the curr element is not close brachet we have to push the elements till we get closed bracket in the String
        // and after the loop we will print output as false which means the string is not duplicate 

            if(stack.peek()=='('){
            System.out.println("true");
            return;
        }
        else{
            while(stack.peek()!='('){
                stack.pop();
            }
            stack.pop();
        }

       }
       else{
        stack.push(ch);
       }
    


        
    }
    System.out.println("false");
    


    }
    
}
