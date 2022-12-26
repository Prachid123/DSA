
public class stackUsingLinkedList {
    
     class Node{
      Node next;
      int data;
      Node(int data){
         this.next=null;
         this.data =data;
      }
      
     
     }
     Node head;
    int size;
    stackUsingLinkedList(){
        this.head=null;
        this.size=0;
     }
     public boolean isEmpty(){
        return (size()==0);
     }
     public int size(){
        return size;
     }
     public void push(int data){
    Node newNode = new Node(data);
    newNode.next = head;
    head=newNode;
    size++;

        
     }

     public int pop(){
      if(size()==0){
         System.out.println("stackEmptyException");
      }
      int temp= head.data;
      head=head.next;
      size--;
      return temp;
      
 

     }
    public static void main(String[] args) {
      stackUsingLinkedList stack = new stackUsingLinkedList();
      stack.push(11);
      stack.push(45);
      stack.push(56);
      stack.push(89);
      while(!stack.isEmpty()){
         System.out.println(stack.pop());
      }
  
    }
}
