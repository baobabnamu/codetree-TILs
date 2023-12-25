import java.util.*;
import java.io.*;

public class Main {
    public static void printHelloWorld(int n) {
        if(n==0) return;
        printHelloWorld(n-1);
        System.out.println("HelloWorld");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        printHelloWorld(n);
    }
}