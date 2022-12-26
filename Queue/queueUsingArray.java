
package Queue;


public class queueUsingArray {
    static int data[];
    int front;
    int rear;
    int size;
    queueUsingArray(int capacity){
        data = new int[capacity];
        front=-1;
        rear=-1;
        size=0;
    }   
    int size(){
        return size;
    }
    boolean isEmpty(){
        return size==0;
    }
    int front(){
        if(size()==0){
            System.out.println("queueEmptyException");
        }
        
        return data[front];
    }
    void enqueue(int element){
        if(size()==data.length){
            System.out.println("queueFullException");
        }
        if(size()==0){
            front=0;
         }
        
        rear++;
        size++;
        if(rear==data.length){
            rear=0;
        }
        data[rear]= element;

 
    } 
    int dequeue(){
        if(size==0){
            
            System.out.println("queueEmptyException");
        }
        
        int temp=data[front];
        
        front++;
        if(front == data.length){
            front=0;
        }
        size--;
        if(size==0){
          rear=-1;
          front=-1;
        }
        return temp;
    }
    public static void main(String[] args) {
        queueUsingArray queue = new queueUsingArray(5);
    
        
        for (int i = 1; i <= 5 ; i++) {
            queue.enqueue(i);
            
        }
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }

    }
}
