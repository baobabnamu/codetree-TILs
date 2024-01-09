import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        int len = a.length;
        
        int cnt = 0;
        for(int i = 0; i < len; i++) {
            if(a[i] == '(') {
                for(int j = i + 1; j < len; j++) {
                    if(a[j] == ')') cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}