import java.io.*;

public class Main {
    public static void printMagicNums(int n) {
        if(n == 0) {
            return;
        }

        System.out.printf("%d ", n);
        printMagicNums(n - 1);
        System.out.printf("%d ", n);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        printMagicNums(n);
    }
}