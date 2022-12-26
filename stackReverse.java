import java.util.*;
public class stackReverse {
    public static void pushAtBottom(int element,Stack<Integer> stack){
        if(stack.isEmpty()){
            stack.push(element);
            return;
        }
        int top=stack.pop();
        pushAtBottom(element, stack);
        stack.push(top);
    }

    public static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int temp = stack.pop();
        reverseStack(stack);
        pushAtBottom(temp, stack);
    } 
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        reverseStack(stack);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
