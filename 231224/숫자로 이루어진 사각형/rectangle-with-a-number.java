import java.util.*;
import java.io.*;

public class Main {
    public static void printNRect(int n) {
        int number = 1;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                number = number >= 10 ? 1 : number;
                System.out.printf("%d ", number++);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printNRect(n);
    }
}