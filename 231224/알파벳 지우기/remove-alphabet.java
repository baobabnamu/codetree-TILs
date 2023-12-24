import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for(int i=0; i<2; i++) {
            char[] charArr = br.readLine().toCharArray();
            StringBuilder sb = new StringBuilder();
            for(char c : charArr) {
                if(((int)c >= 97 && (int)c <= 122) || ((int)c >= 65 && (int)c <= 90)) {
                    continue;
                } else {
                    sb.append(c);
                }
            }
            sum += Integer.parseInt(sb.toString());
        }
        System.out.print(sum);
    }
}