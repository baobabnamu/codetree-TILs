import java.util.*;
import java.io.*;

public class Main {
    public static boolean isMagicString(String baseStr) {
        char[] charArr = baseStr.toCharArray();

        for(int i=0; i<charArr.length; i++) {
            if (charArr[i] != baseStr.charAt(0)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String baseStr = br.readLine();
        String result = isMagicString(baseStr) ? "Yes" : "No";
        System.out.print(result);
    }
}