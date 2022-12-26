import java.util.*;

public class parenthesisMatchingProb {
    public static boolean isparenthesisMatching(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if(opening(curr)){
                stack.push(curr);

            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else if(!balance(stack.peek(),curr)){
                    return false;

                }
                else{
                    stack.pop();
                }
                

            }
            
                

            }
            return(stack.isEmpty());
            

            

        } 

    
    
    static boolean  opening(char curr){
        return (curr=='(' || curr== '[' || curr == '{');
    }
    static boolean balance(char curr1,char curr2){
        return (curr1 =='(' &&  curr2==')')|| (curr1 =='[' && curr2 ==']') || (curr1=='{' && curr2 =='}') ;
    }
    public static void main(String[] args) {
        String str ="()([])";
        System.out.println(isparenthesisMatching(str));
        
    }
}
