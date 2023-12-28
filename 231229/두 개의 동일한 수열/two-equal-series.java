import java.util.*;
import java.io.*;

public class Main {
    public static boolean compareSequence(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0; i<a.length; i++) {
            if(a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] seqA = new int[n];
        int[] seqB = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            seqA[i] = temp;
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            seqB[i] = temp;
        }

        System.out.print(compareSequence(seqA, seqB) ? "Yes" : "No");
    }
}