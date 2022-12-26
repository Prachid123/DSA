package Queue;
import java.util.*;
public class queueReverse {
    
    static Queue<Integer> queue = new LinkedList<>();
    static void reverse()

    { 
   
        Stack<Integer> stack= new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.peek());
            queue.remove();

        }
        while(!stack.isEmpty()){
            queue.add(stack.peek());
            stack.pop();
        }
        

    }
    static void print(){
        
        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }
    }
    public static void main(String[] args) {
    // queue = new LinkedList<Integer>();
   
    queue.add(10);
    queue.add(20);
    queue.add(30);
    queue.add(40);
    queue.add(50);
    reverse();
    print();
    }
    
}
