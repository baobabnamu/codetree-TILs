import java.io.*;

public class Main {
    public static int calc(int n) {
        if(n == 1) {
            return 1;
        }

        if (n == 2){ 
            return 2; 
        }

        return calc(n/3) + calc(n-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(calc(n));
    }
}