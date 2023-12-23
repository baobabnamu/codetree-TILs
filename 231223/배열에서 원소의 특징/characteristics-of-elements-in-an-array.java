import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int temp;
        int[] arr = new int[10];

        for(int i=0; i<10; i++) {
            temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
            if(temp%3==0 && i>=1) {
                System.out.printf("%d", arr[i-1]);
                break;
            }
        }
    }
}