public class stackUsingArray {
    private int arr[];
    private int top;
    public stackUsingArray(int capacity){
         arr = new int[capacity];
         top=-1;

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
        int temp=arr[top];
        if(size()==0){
            System.out.println("stackEmptyException");
        }
        
        top--;
        return temp;
    }
    public int top(){
        if(size()==0){
            System.out.println("stackEmptyException");
        }
        return arr[top];
        
    }

    public static void main(String[] args) {
        stackUsingArray stack = new stackUsingArray(5);
        for (int i = 1; i <=5; i++) {
            stack.push(i);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

}
