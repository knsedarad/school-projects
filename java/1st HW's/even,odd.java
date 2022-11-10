// how many odds , how many evens
import java.util.Scanner;
public class aaa {
  public static void main(String[] args) {
    
      int x, n =5 , odd = 0, even = 0;
      
      Scanner input = new Scanner(System.in);
      

      for (int i = 1; i <= n; i++) {
          x = input.nextInt();
          if (x % 2 == 0)
              even++;
          else
              odd++;
              
      }
      System.out. print(even );
      System.out. print(" " +odd);

    
    }      
}
