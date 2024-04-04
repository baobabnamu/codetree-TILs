import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(Math.abs(a - b) == 1 && Math.abs(b - c) == 1) {
            System.out.print(0);
        } else if (Math.abs(a - b) == 2 || Math.abs(b - c) == 2) {
            System.out.print(1);
        } else {
            System.out.print(2);
        }
    }
}