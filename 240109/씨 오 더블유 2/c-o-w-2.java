import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] a = br.readLine().toCharArray();
        int len = a.length;

        int cnt = 0;
        for(int i = 0; i < len; i++) {
            if(a[i] == 'C') {
                for(int j = i + 1; j < len; j++) {
                    if(a[j] == 'O') {
                        for(int k = j + 1; k < len; k++) {
                            if(a[k] == 'W') cnt++;
                        }
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}