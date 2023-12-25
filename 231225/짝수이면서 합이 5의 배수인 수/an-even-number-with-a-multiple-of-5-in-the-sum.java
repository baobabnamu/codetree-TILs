import java.util.*;
import java.io.*;

public class Main {
    public static boolean isMagicNumber(int n) {
        int newNumber = Integer.parseInt(Integer.toString(n).charAt(0)+"") + Integer.parseInt(Integer.toString(n).charAt(1)+"");
        return n%2 == 0 && newNumber % 5 == 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        if(isMagicNumber(n)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}