import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();

        int ans = 0;
        for(int i = 0; i < a.length - 1; i++) {
            if(a[i] == '(' && a[i + 1] == '(') {
                for(int j = i + 2; j < a.length - 1; j++) {
                    if(a[j] == ')' && a[j + 1] == ')') ans++;
                }
            }
        }

        System.out.print(ans);
    }
}