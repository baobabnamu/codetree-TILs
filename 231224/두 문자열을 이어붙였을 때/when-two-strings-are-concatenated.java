import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();

        StringBuilder sb1 = new StringBuilder(s1+s2);
        StringBuilder sb2 = new StringBuilder(s2+s1);
        System.out.print(sb1.toString().equals(sb2.toString()));
    }
}