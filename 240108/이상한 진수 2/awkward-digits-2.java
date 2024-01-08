import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String binaryCode = br.readLine();
        int len = binaryCode.length();
        boolean flag = false;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<len; i++) {
            if(binaryCode.charAt(i) == '0') {
                sb.append(binaryCode.substring(0, i) + "1" + binaryCode.substring(i + 1, len));
                flag = true;
                break;
            }
        }

        if(!flag) {
            int index = 0;
            for(int i=binaryCode.length() - 1; i>=0; i--) {
                if(binaryCode.charAt(i) == '1') {
                    index = i;
                    break;
                }
            }

            for(int i=0; i<index; i++) {
                sb.append(binaryCode.charAt(i));
            }

            sb.append("0");

            for(int i=index + 1; i<len - 1; i++) {
                sb.append(binaryCode.charAt(i));
            }
        }

        int ans = 0;
        int power = 0;
        for(int i=binaryCode.length() - 1; i >= 0; i--) {
            int digit = binaryCode.charAt(i) + 0;
            ans += digit * Math.pow(2, power);
            power++;
        }

        System.out.print(ans);
    }
}