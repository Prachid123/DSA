package Queue;

public class queueUsingLL2 {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;

    }
 

    }
    Node rear;
    Node front ;
    int size;
     queueUsingLL2(){
        this.rear= null;
        this.front = null;
        this.size=0;

    }
    boolean isEmpty(){
      return front==null;  
    }
    int size(){
        return size;

    }
    public int front(){
        if(front==null){
            System.out.println("queueEmptyException");
        }
        return front.data;
    }
    void enqueue(int data){
        Node newNode = new Node(data);
        if(rear ==null){
            rear = newNode;
            front = newNode;


        }
        else{
            rear.next = newNode;
            rear = newNode;
            size++;
        }

    }
    int dequeue(){
        if(front==null){
            System.out.println("queueEmptyException");
        }
        int temp = front.data;
        front = front.next;
        size--;
        return temp;
    }
    public static void main(String[] args) {
        queueUsingLL2 queue = new queueUsingLL2();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(2);
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }

    }


    }

