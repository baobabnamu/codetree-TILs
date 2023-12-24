import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'e' && !flag) {
                flag = true;
                continue;
            }
            sb.append(str.charAt(i));
        }
        System.out.print(sb.toString());
    }
}