import java.util.Scanner;
public class worldcup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a%4==0) {
            System.out.println("u have world cup in "+a);
        }
        else if (a%4==1) {
            System.out.println("world cup on "+a);
        }
        else if (a%4==2) {
            System.out.println("worldcup in "+a);
        }
        else if (a%4==3) {
            System.out.println("world cup in "+a);
        }
        else {
            System.out.println("wrong input!!!");
        }
        scan.close();
    }
}
