package Queue;

public class queueUsingArray3 {
    int arr[];
    int size;
    
    int rear;
    int front;
    queueUsingArray3(int size){
        arr = new int[size];
        size=0;
        rear=-1;
        front =-1;


    }
    boolean isEmpty(){
        return rear==-1;
    }
    int size(){
        return size;
    }
    int front(){
        if(rear==-1){
            System.out.println("queueEmptyException");
        }
        
            return arr[0];
            
    }

    void enqueue(int element){
        
        if(rear==size-1){
            System.out.println("queueFullException");
        }
        
        if(rear==-1){
            front++;
            rear++;
            arr[rear]=element;
           
        }
        else{
            
            rear++;
            arr[rear] = element;
            size++;
        }
    }
    int dequeue(){
        if(rear==-1){
            System.out.println("queueEmptyException");
        }

        int temp = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i]=arr[i+1];
            
        }
        rear--;
        size--;
        return temp;
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
