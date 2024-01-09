import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        int max = 0;

        for(int i = 1; i < a.length; i++) {
            a[i] = toOppositeNum(a[i]); // 비교를 위해 숫자 뒤집고
            String binaryN = String.valueOf(a);
            max = Math.max(max, Integer.parseInt(binaryN, 2));
            a[i] = toOppositeNum(a[i]); // 비교 후 다시 원복
        }

        System.out.print(max);
    }

    public static char toOppositeNum(char digit) {
        if(digit == '1') return '0';
        return '1';
    }
}