import java.io.*;

public class Main {
    public static int sequenceCalc(int n) {
        if(n==1) {
            return 2;
        }

        if(n==2) {
            return 4;
        }

        return (sequenceCalc(n-1) * sequenceCalc(n-2)) % 100;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.print(sequenceCalc(n));
    }
}