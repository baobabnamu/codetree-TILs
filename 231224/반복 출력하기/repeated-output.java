import java.io.*;

public class Main {
    public static void printNLines(int n) {
        for(int i=0; i<n; i++) {
            System.out.println("12345^&*()_");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printNLines(n);
    }
}