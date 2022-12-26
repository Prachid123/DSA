package Queue;

public class queueUsingCircularArray {
    int a[];
    int n;
    int front=-1;
    int rear=-1;
    queueUsingCircularArray(int n){
    a = new int[n];
    this.n=n;
    }
    boolean isEmpty(){
        return front==-1;
    }
    void enqueue(int data){
       if((rear+1)%n==front){
        System.out.println("queueFullException");
       } 
       if(front==-1){
        front =0;}
        rear=(rear+1)%n;
        a[rear] = data;
       
    }
    int dequeue(){
        if(front==-1){
            System.out.println("queueEmptyException");
        }
        int temp = a[front];
        if(front==rear){
            front =-1;
            rear =-1;

        }
        else{
            front =(front+1)%n;

        }
        return temp;
    }
   
    public static void main(String[] args) {
        queueUsingCircularArray queue = new queueUsingCircularArray(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(9);
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }        
       

    }
}
