import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArr = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char c : charArr) {
            int ascii = (int)c >= 97 && (int)c <= 122 ? c-32 : c+32;
            sb.append((char)ascii);
        }
            
        System.out.print(sb.toString());
    }
}