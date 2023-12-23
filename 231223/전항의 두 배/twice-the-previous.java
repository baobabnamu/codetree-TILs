import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken()); 
        int n2 = Integer.parseInt(st.nextToken()); 
        int temp;
        int arr[] = new int[10];

        arr[0] = n1;
        arr[1] = n2;

        System.out.printf("%d %d ", arr[0], arr[1]);
        for(int i=2; i<10; i++) {
            // update
            arr[i] = (arr[i-2]*2) + arr[i-1];

            // print (an)
            System.out.printf("%d ", arr[i]);
        }
    }
}