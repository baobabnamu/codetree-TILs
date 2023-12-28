import java.util.*;
import java.io.*;

public class Main {
    public static boolean compareChars(char[] a, char[] b) {
        if(a.length != b.length) {
            return false;
        }

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0; i<a.length; i++) {
            if(a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charsA = br.readLine().toCharArray();
        char[] charsB = br.readLine().toCharArray();
        
        System.out.print(compareChars(charsA, charsB) ? "Yes" : "No");
    }
}