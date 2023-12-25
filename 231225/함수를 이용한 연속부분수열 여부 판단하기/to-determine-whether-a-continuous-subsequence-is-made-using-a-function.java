import java.util.*;
import java.io.*;

public class Main {
    public static boolean checkSequence(int[] baseSequence, int[] subSequence) {
        for(int i=0; i<baseSequence.length-subSequence.length; i++) {
            int cnt = 0;
            for(int j=0; j<subSequence.length; j++) {
                if(baseSequence[i+j] == subSequence[j]) {
                    cnt++;
                } else {
                    continue;
                }                    
            }
            if(cnt == subSequence.length) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] baseSequence = new int[n];
        int[] subSequence = new int[m];
        
        // seq input
        st = new StringTokenizer(br.readLine());
        int temp;
        for(int i=0; i<n; i++) {
            temp = Integer.parseInt(st.nextToken());
            baseSequence[i] = temp;
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            temp = Integer.parseInt(st.nextToken());
            subSequence[i] = temp;
        }
        
        // result print
        if(checkSequence(baseSequence, subSequence)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}