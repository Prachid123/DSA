import java.util.*;
public class stackPrevSmallerElement{
    public static void prevSmallElemet(int arr[]){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while(!stack.isEmpty()&&stack.peek()>=arr[i]){
                stack.pop();

            }
            if(stack.isEmpty()){
                System.out.println("-1");
            }
            else{
                System.out.println(stack.peek());
            }
            stack.push(arr[i]);
            
        }
        
    }

    public static void main(String[] args) {
     
     int arr[] = new int[8];
     arr[0]=4;
     arr[1]=10;
     arr[2]=5;
     arr[3]=8;
     arr[4]=20;
     arr[5]=15;
     arr[6]=3;
     arr[7]=12;
     prevSmallElemet(arr);

    
     

     };
    }