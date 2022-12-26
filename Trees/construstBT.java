package Trees;
class Node{
      Node left;
      Node right;
      int data;
      Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

      }
}
public class construstBT {
      
      public static Node Solution(int pre[],int in[],int preI,int n,int s,int e){
            if(s>e ||preI>=n){
                  return null;
            }
         
            int element = pre[preI++];
            Node root = new  Node(element);
       
            int pos = search( in,element);
            root.left=Solution(pre, in, preI, n, s , pos-1);
            root.right=Solution(pre, in, preI, n, pos+1, e);
            return root;



      }
      public static int search(int in[],int element){
            for (int i = 0; i < in.length; i++) {
                  if(in[i]==element){
                        return i;
                  }
                
            }
            return -1;
      }
      void printTree(Node node ){
            if(node==null){
                  return;
            }
            printTree(node.left);
            System.out.println(node.data);
            printTree(node.right);

      }
    
      public static void main(String[] args) {;
        int pre[] = {3,9,20,15,7} ;
        int in[] ={9,3,15,20,7};
        
        construstBT tree = new construstBT();
        int n = pre.length;
        int preI =0;
     
        Node node = construstBT.Solution(pre,in,preI,n,0,n-1);
        tree.printTree(node);

        
      }
}
