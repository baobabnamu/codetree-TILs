import java.util.*;
import java.io.*;

public class Main {
    public static int calcIndex(String baseString, String subString) {
        char[] baseStringChars = baseString.toCharArray();
        char[] subStringChars = subString.toCharArray();
        int cnt;

        for(int i=0; i<=baseStringChars.length-subStringChars.length; i++) {
            cnt = 0;
            for(int j=0; j<subStringChars.length; j++) {
                if(baseStringChars[i+j] == subStringChars[j]) {
                    cnt++;
                }
            }
            if(cnt == subStringChars.length) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
        String baseString = br.readLine();
        String subString = br.readLine();
        int idx = calcIndex(baseString, subString);
        System.out.printf("%d", idx);
    }
}