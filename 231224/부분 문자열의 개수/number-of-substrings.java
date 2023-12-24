import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String subStr = br.readLine();
        int cnt = 0;

        for(int i=0; i<str.length()-1; i++) {
            if(subStr.equals(str.substring(i, i+2))) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}