import java.io.*;

public class Main {
    public static int fibonacci(int n) {
        if(n==1) {
            return 1;
        } 

        if(n==2) {
            return 1;
        } 

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(fibonacci(n));
    }
}