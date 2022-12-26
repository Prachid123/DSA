package Trees;
// import java.lang.*;
import java.util.*;

public class binaryTraversals{
    class Node{
        int data;
        Node left;
        Node right;
       
        Node(int data){
            this.data = data;
            
        }
    }
    public static void preOrder(Node root){
        if(root == null){
            System.out.print("");
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root
        .right);


    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static int maxDepth(Node root){
        if(root==null){
            return 0;
        }
        int lH= maxDepth(root.left);
        int  rH= maxDepth(root.right);
        return Math.max(lH,rH)+1;

    }
    public static int sizeTree(Node root){
        if(root==null){
            return 0;
        }
        return sizeTree(root.left)+sizeTree(root.right)+1;
    }
    public static int maxDataTree(Node root){
        if(root==null){
            return Integer.MIN_VALUE;

        }
        return Math.max(root.data, Math.max(maxDataTree(root.left), maxDataTree(root.right)));
    }
    public static void levelOrderTree(Node root){
        if(root==null){
            return ;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            Node curr = queue.remove();
            if(curr==null){
                if(queue.isEmpty()){
                    return ;
                }
                queue.add(null);
                System.out.println();

            }
            else{
            System.out.print(curr.data);
            if(curr.left!=null){
                queue.add(curr.left);
            }
            if(curr.right!=null){
                queue.add(curr.right);
            }
        }
    }
    }
    public static void levelOrderTree2(Node root){
        if(root==null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node curr = queue.remove();
            System.out.print(curr.data);
            if(curr.left!=null){
                queue.add(curr.left);
            }
            if(curr.right!=null){
                queue.add(curr.right);
            }
            
        }

    }
    public static void leftView(Node root){
       ArrayList<Node> list = new ArrayList<>();
       printLeftView(root,list,0);
       for(Node curr : list){
        System.out.print(curr.data+" ");
       }
      
    }
    static void printLeftView( Node root, ArrayList<Node> list, int level){
        if(root==null){
            return;
        }
        if(level==list.size()){
            list.add(root);

        }
        printLeftView(root.left, list, level+1);
        printLeftView(root.right, list, level+1);

    }
    public static ArrayList<Integer> topView(Node root){
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer,Integer> map = new TreeMap<>();
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair curr = q.remove();
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd, curr.node.data);
            }
            if(curr.node.left!=null){
                q.add(new Pair(curr.hd-1,curr.node.left));
            }
            if(curr.node.right!=null){
                q.add(new Pair(curr.hd+1,curr.node.right));
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer, Integer>entry : map.entrySet()){
            ans.add(entry.getValue());
        }   
        return ans;
    }
    static class Pair{
        int hd;
        Node node;
        public Pair(int hd,Node node){
            this.hd = hd;
            this.node = node;
        }
    }
    
  
    public static int diameter(Node root){
        if(root==null){
          return 0;
        }
        int dl = diameter(root.left);
        int dr = diameter(root.right);
        int curr = height(root.left)+height(root.right)+1;
        return Math.max(curr, Math.max(dl,dr));
    }  
    // static int ans =0;
    static int height(Node root){
        if(root==null){
            return 0;

        }
        
        return 1+Math.max(height(root.left), height(root.right));
    } 
    
    static int ans[] = new int[1];
    public static boolean sumTree(Node root){
        
        ans[0]=1;
        sumOfTree(root);
        if(ans[0]==0){
            return false;
        }
        return true;
    }
    public static int sumOfTree(Node root){
     if(root==null){
        return 0;
     }
     if(root.left==null && root.right==null){
        return root.data;
     }
     int left = sumOfTree(root.left);
     int right = sumOfTree(root.right);
     if((left+right)!= root.data){
        ans[0] = 0;
     }
  
     return left + right +root.data;
    }

    // Boundary Traversal in a Binary Tree

    public static void leftboundaryTraversal(Node root ){
        if(root==null || (root.left==null && root.right==null)){
            return ;
        }
        
        if(root.left!=null){
            System.out.println(root.data);
            leftboundaryTraversal(root.left);
        }
        
        leftboundaryTraversal(root.right);
    }

    public static void leafBoundaryTraversal(Node root){
        if(root==null){
            return;
        }
        
        if(root.left==null && root.right==null){
            System.out.println(root.data);
        }
        leafBoundaryTraversal(root.left);
        leafBoundaryTraversal(root.right);

    }
    public static void rightBoundaryTraversal(Node root){
        if(root==null || (root.left==null && root.right==null )){
            return;
        }
        if(root.right!=null){
            rightBoundaryTraversal(root.right);
            System.out.println(root.data);
        }
       
            rightBoundaryTraversal(root.left);
    }
    static void printBoundaryTraversal(Node root){
        if(root==null)
        return;
        if(root.left!=null){
            
            leftboundaryTraversal(root);
        }
        leafBoundaryTraversal(root);
        if(root.right!=null){
          
          rightBoundaryTraversal(root.right);
        }
        
    }
  
   public static int bloodLine(Node root){
   if(root==null){
    return 0;
   }
    int len =0;
   int maxLen =0;
   int sum =0;
   int maxSum = Integer.MIN_VALUE;
   bloodL(root,len,maxLen,sum,maxSum);
   return maxSum;
   
    
   }
   public static void bloodL(Node root, int len,int maxLen,int sum,int maxSum){
    if(root==null){
        if(len>maxLen){
            maxLen=len;
            maxSum=sum;
        }
        else if(len == maxLen && maxSum<sum){
            maxSum =Math.max(maxSum,sum);
        }
        return;
       
    }
    
   sum= sum+root.data;
   bloodL(root.left, len+1, maxLen, sum, maxSum);
   bloodL(root.right, len+1, maxLen, sum, maxSum);
   
   }


   int idx=-1;

    public Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);
        return newNode;
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTraversals tree = new binaryTraversals();
        

        Node root = tree.buildTree(nodes);
   
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        System.out.println("height of the tree is :");
        System.out.println(maxDepth(root));
        System.out.println("size of a tree is "+ sizeTree(root));
        System.out.println("max data of a tree is "+ maxDataTree(root));
        System.out.println("level order tree is :");
        levelOrderTree(root);
        System.out.println();
        levelOrderTree2(root);
        System.out.println();
        System.out.println("Left view of the tree is ");
        leftView(root);
        System.out.println("top view of the tree is ");
        System.out.println(topView(root));
        System.out.println("Diameter of a binary tree is ");
        System.out.println(diameter(root));
        System.out.println(sumTree(root));
        sumOfTree(root);
        System.out.println("Boundary traversal is :");
        printBoundaryTraversal(root);
        System.out.println("Longest BloodLine is:  ");
        System.out.println(bloodLine(root));        
        
        
        
    }
}
