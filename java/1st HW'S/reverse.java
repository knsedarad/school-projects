//this code ll reverse int input
//for example: input:123-->output:321 
import java.util.Scanner;

class rev {
      
    
    static int rev = 0;
   
 
    
    static void reverse(int n){
       
      if(n<=0)
        return ;
       
      int rem = n%10;     
       
      rev = (rev*10) + rem;
       
      reverse(n/10);
    }
     
   
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
   
        int n = scan.nextInt(); ;
      
        reverse(n);
       
        System.out.print(rev);
    }
}
//finished-project
