import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Stack<Integer> stack = new Stack<>();

        st = new StringTokenizer(br.readLine());
        int temp;
        for(int i=0; i<n; i++) {
            temp = Integer.parseInt(st.nextToken());
            if(temp%2==0) {
                stack.push(temp);
            }
        }
        
        while(!stack.isEmpty()) {
            System.out.printf("%d ", stack.pop());
        }

    }
}