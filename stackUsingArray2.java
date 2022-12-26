public class stackUsingArray2 {
    int top;
    int arr[];
    
    public stackUsingArray2(int capacity){
        top=-1;
        arr = new int[capacity];

    }

    public boolean isEmpty(){
        return(top==-1);
    }
    public int size(){
        return top+1;
    }
    public void push(int element){
        if(size()==arr.length){
            System.out.println("stackFullException");
        }
        top++;
        arr[top]=element;

    }   
    public int pop(){
        if(size()==0){
            System.out.println("stackEmptyException");
        }
        int temp = arr[top];        top--;
        return temp;

    }
    public static void main(String[] args) {
        stackUsingArray2 stack = new stackUsingArray2(10);
        for (int i = 1; i <=5; i++) {
           stack.push(i); 
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }       
    }
}
