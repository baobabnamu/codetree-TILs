import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);
        if(c == 97) {
            System.out.printf("%c ", 'z');
        } else {
            System.out.printf("%c ", c-1);
        }
    }
}