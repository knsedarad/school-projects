// finding average 
import java.util.Scanner;
public class hw {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a, b, c, d;
        
        a = scan.nextDouble();
     
        b = scan.nextDouble();
        
        c = scan.nextDouble();
        
        d = scan.nextDouble();
        double avrge = (a + b + c + d) / 4;
        System.out.printf("average = %.3f", avrge);
    }
}
//finished-project
