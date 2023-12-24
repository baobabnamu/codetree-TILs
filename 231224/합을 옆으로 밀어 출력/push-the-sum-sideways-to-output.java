import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int temp;
        int sum = 0;

        for(int i=0; i<n; i++) {
            temp = Integer.parseInt(br.readLine());
            sum += temp;
        }

        String s = sum + "";
        System.out.print(s.substring(1, s.length()) + s.charAt(0));
    }
}