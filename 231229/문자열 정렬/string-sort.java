import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder();
        for(char c : chars) {
            sb.append(c);
        }
        System.out.print(sb.toString());
    }
}