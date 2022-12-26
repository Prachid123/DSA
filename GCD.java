public class GCD {


  public void finidngGcd(int a ,int b){
    if(a>=b){
        int temp = a;
        a=b;
        b= temp;
    }
    
    if(a==0){
            System.out.println(b);
        }
        
        if(b==0){
            System.out.println(a); 
        }
        else{
            int c = a%b;
        finidngGcd(a,c);
   

        
        

    }
    
}
public static void main(String[] args) {
    int a=10;
    int b=150;
    GCD g = new GCD();
   g.finidngGcd(a, b);
   
   
}

  }
 

  

    

    

