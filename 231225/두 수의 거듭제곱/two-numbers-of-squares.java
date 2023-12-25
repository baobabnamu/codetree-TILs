import java.util.*;
import java.io.*;

public class Main {
    public static int calcPow(int a, int b){
        int result = a;
        for(int i=1; i<b; i++) {
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int pow = calcPow(a,b);
        System.out.print(pow);
    }
}