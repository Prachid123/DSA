public class stackUsingArrayList {
    int data[];
    int top;
    public stackUsingArrayList(int capacity){
        data = new int[capacity];
        top =-1;

    }
    public boolean isEmpty(){
        return(top==-1);
    }
    public int size(){
        return top+1;
    }

    public int top(){
        if(size()==0){
            System.out.println("stackFullException");
        }
        return data[top];
    }
    public void push(int element){
        if(size()==data.length){
            doublecapacity();
        }
        top++;
        data[top]=element;
    }

    public void doublecapacity(){

        int temp[]=data;
        data = new int[2*temp.length];
        for (int i = 0; i <= top; i++) {
            data[i]=temp[i];
        }


    }


    public int pop(){
        int temp=data[top];
        if(size()==0){
            System.out.println("stackEmptyException");
        }
        top--;
        return temp;

    }

    public static void main(String[] args) {
        stackUsingArrayList stack = new stackUsingArrayList(2);
        for (int i = 1; i <= 3; i++) {
            stack.push(i);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
