import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char baseAlphabet = str.charAt(0);
        char updatedAlphabet = str.charAt(1);
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == updatedAlphabet) {
                sb.append(baseAlphabet);
            } else {
                sb.append(str.charAt(i));
            }
        }

        System.out.print(sb.toString());
    }
}