//takeing n input give (maximum+minimum)az output
import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b,c ;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        int minimum,maximum;

        
        if(a < b && a < c){
            minimum = a ;
        }
        else if(b < a && b < c){
            minimum = b ;
        }
        else {
            minimum = c ;
        }

        
        if(a > b && a > c) {
            maximum = a ;
        }
        else if(b > a && b > c){
            maximum = b ;
        }
        else {
            maximum = c;
        }
        System.out.println(minimum+maximum);

    }
}
//finished-project
