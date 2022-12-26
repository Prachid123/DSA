package Queue;

public class queueUsingLinkedList {
    class Node{
        int data;
        
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
    
        }
    }

        Node front;
        
        Node rear;
        int size;
        queueUsingLinkedList(){
            this.front=null;
            this.rear=null;
            this.size=0;
            


        }

        boolean isEmpty(){
            return front==null;
        }

        int size(){
            return size;
        }
        
        int front(){
            if(front==null){
                System.out.println("queueEmptyException");
            }
            return front.data;
        }

        void enqueue(int data){
            Node newNode = new Node(data);
            if(rear==null){
                rear=newNode;
                front=newNode;

            }
            rear.next=newNode;
            rear=newNode;
            size++;
        }

        int dequeue(){
            if(front==null){
                System.out.println("queueEmptyException");
            }
            int temp=front.data;
            front=front.next;
            size--;
            return temp;
        }

     
        public static void main(String[] args) {
            queueUsingLinkedList queue = new queueUsingLinkedList();
            queue.enqueue(89);
            queue.enqueue(45);
            queue.enqueue(78);
            while(!queue.isEmpty()){
                System.out.println(queue.dequeue());
            }
                
            }
        }

  
    
    

