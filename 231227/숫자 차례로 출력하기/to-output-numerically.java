import java.io.*;

public class Main {
    public static void printNumber(int depth, int n) {   
        if(depth>n) return;
        System.out.printf("%d ", depth);
        printNumber(depth+1, n);
    }

    public static void printNumberReverse(int depth, int n) {   
        if(depth<n) return;
        System.out.printf("%d ", depth);
        printNumberReverse(depth-1, n);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        printNumber(1, n);
        System.out.println();
        printNumberReverse(n, 1);
    }
}