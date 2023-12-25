import java.util.*;
import java.io.*;

public class Main {
    public static void calcPrint(int a, char exp, int b) {
        int result = 0;
        switch(exp) {
            case '*':
                result = a*b;
                break;
            case '+':
                result = a+b;
                break;
            case '/':
                result = a/b;
                break;
            case '-':
                result = a-b;
                break;
            default:
                System.out.print("False");
        }

        System.out.printf("%d %c %d = %d", a, exp, b, result);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        char exp = st.nextToken().charAt(0);
        int b = Integer.parseInt(st.nextToken());

        calcPrint(a, exp, b);
    }
}