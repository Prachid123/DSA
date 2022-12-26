package Queue;


public class doubleEndedQueue {
    int front =-1;
    int rear=-1;
    int size;
    int arr[];
    doubleEndedQueue(int size){
        arr = new int[size];
        this.size=size;
    }
    boolean isEmpty(){
        return front ==-1;
    }
    void pushFront(int element){
        if(front == (rear+1)%size){
            System.out.println("Queue is Full");
        }
        else if(front==-1){
            front=rear=0;
        }
        else if(front==0){
            front = size-1;
        }
        else{
            front=(front-1)%size;
        }
        arr[front] = element;
        
}

void pushRear(int element){
    if(front ==(rear+1)%size){
        System.out.println("Queue Is Full");
    }
    else if(front ==-1){
        front =rear=0;
    }
    else if(rear==size-1 && front!=0){
        rear=0;
    }
    
    else{rear=(rear+1)%size;}
    
    arr[rear]=element;
}

int popFront(){
    
    if(front==-1){
        System.out.println("Queue Is Empty");

    }
    int result = arr[front];
    
    if(front == rear){
        front = rear=-1;
    }
    
    else{
        front = (front+1)%size;
    }
    return result;

}
int popRear(){
    
    if(front==-1){
        System.out.println("Queue Is Empty");

    }
    int result = arr[rear];
    
    if(front == rear){
        front = rear=-1;
    }
   
    else{
        rear = (rear-1)%size;
    }
    return result;
}
public static void main(String[] args) {
    doubleEndedQueue queue = new doubleEndedQueue(7);
    
    while(!queue.isEmpty()){
        System.out.println(queue.popRear());
    }
    
    
}


} 
