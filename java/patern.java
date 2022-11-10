import java.util.Scanner;
public class patern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1,a2,a3,a4,a5;
        a1 = scan.nextInt();
        a2 = scan.nextInt();
        a3 = scan.nextInt();
        a4 = scan.nextInt();
        a5 = scan.nextInt();
    
        int b1 = a2- a1;
        int b2 = a3 - a2;
        int b3 = a4 - a3;
        int b4 = a5 - a4;

        int c1 = b2 - b1;
        int c2= b3 - b2;
        int c3= b4 - b3;

        int d1 = c2 - c1;
        int d2 = c3 - c2;

        int e = d2 - d1;
        System.out.println(e);

    }
}
//finished-project
