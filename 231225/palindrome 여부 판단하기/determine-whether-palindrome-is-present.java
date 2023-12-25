import java.util.*;
import java.io.*;

public class Main {
    public static boolean isPalindrome(String s) {
        char[] tempArr = s.toCharArray();
        int idx = 0;

        for(int i=s.length()-1; i>=0; i--) {
            if(tempArr[i] != s.charAt(idx++)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        if(isPalindrome(s)) {
            System.out.printf("Yes");
        } else {
            System.out.printf("No");
        }
    }
}