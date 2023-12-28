import java.io.*;
import java.util.*;

public class Main {
    public static int magicCalc(int num) {
        if(num < 10) {
            return num;
        }
        return magicCalc(num/10)+magicCalc(num%10);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());

        System.out.print(magicCalc(num1*num2*num3));
    }
}