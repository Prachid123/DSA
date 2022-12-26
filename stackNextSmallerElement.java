import java.util.*;
public class stackNextSmallerElement{
    public static void SmallElemet(int arr[]){
        int ans[] = new int[arr.length];
        int j=0;
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length-1; i>=0; i--) {
            while(!stack.isEmpty()&&stack.peek()>=arr[i]){
                stack.pop();

            }
            if(stack.isEmpty()){
                ans[j]=-1;
                j++;
            }
            else{
            
            ans[j] = stack.peek();
            j++;


                
            
            }
            stack.push(arr[i]);
            
           
            
        }
        for (int x = ans.length-1; x >=0; x--) {
            System.out.println(ans[x]);
            
        }
        
    }

    public static void main(String[] args) {
     
     int arr[] = {3,10,5,1,15,10,7,6};
     SmallElemet(arr);
    
     

     };
    } 