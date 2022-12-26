public class stachUsingArrayList2{
    int arr[];
    int top;

    public stachUsingArrayList2(int capacity){
       arr= new int[capacity];
       top=-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public int size(){
        return top+1;
    }
    public void push(int element){
        if(size()==arr.length){
            doubleCapacityStack();
        }
        top++;
        arr[top]=element;
    }
    public void doubleCapacityStack(){
        int temp[]=arr;
        arr= new int[2*temp.length];
        for (int i = 0; i < top; i++) {
            arr[i]=temp[i];
            
        }
    }
        public int pop(){
            if(size()==0){
                System.out.println("stackEmptyException");
            }
            int temp=arr[top];
            top--;
            return temp;


        
   }

   public static void main(String[] args) {
    stachUsingArrayList2 stack = new stachUsingArrayList2(3);
    for (int i = 0; i < 5; i++) {
        stack.push(i);
        
    }
    while(!stack.isEmpty()){
        System.out.println(stack.pop());
    }
   }


}
