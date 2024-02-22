import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int ans = 0;
        for(int i = x; i <= y; i++) {
            ans = Math.max(ans, calcNumber(i));
        }

        System.out.print(ans);
    }

    private static int calcNumber(int number) {
        int result = 0;

        String s = Integer.toString(number);
        for(int i = 0; i < s.length(); i++) {
            result += Integer.parseInt(s.substring(i, i + 1));
        }

        return result;
    }
}