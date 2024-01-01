import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] blocks = new int[n+1];
        
        for(int i=0; i<k; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for(int j=start; j<=end; j++) {
                blocks[j] += 1;
            }
        }

        Arrays.sort(blocks);

        System.out.print(blocks[blocks.length-1]);
    }
}