import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String binaryCode = br.readLine();
        int number = 0;

        for(int i=0; i<binaryCode.length(); i++) {
            number = 2 * number + Integer.parseInt(binaryCode.substring(i, i+1));
        }

        System.out.println(number);
    }
}