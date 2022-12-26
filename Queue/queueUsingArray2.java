package Queue;

public class queueUsingArray2 {
    int arr[];
    int size;
   
    int rear;
    queueUsingArray2(int size){
        arr = new int[size];
        this.size=size;
        rear=-1;
        


    }

    boolean isEmpty(){
        return rear==-1;
    }
    int front(){
        if(rear==-1){
            System.out.println("queueEmptyException");
        }
        
        return arr[0];
    } 

    void enqueue(int element){
        if(rear==size-1){
            System.out.println("queueFullEception");
        }
        rear++;
        arr[rear]= element;
        

    }
    int dequeue(){
        int front = arr[0];
        if(rear==-1){
            System.out.println("stackEmptyExceptiom");
        }
        for (int i = 0; i < rear; i++) {
            arr[i]=arr[i+1];

            
        }
        rear--;        
        return front;
    }

    public static void main(String[] args) {
        queueUsingArray2 queue = new queueUsingArray2(6);
        for (int i = 1; i <=5; i++) {
            queue.enqueue(i);
        }
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
  

}
