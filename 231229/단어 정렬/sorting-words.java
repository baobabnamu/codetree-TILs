import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];

        for(int i=0; i<n; i++) {
            String word = br.readLine();
            words[i] = word;
        }

        Arrays.sort(words);

        for(String word : words) {
            System.out.printf("%s\n", word);
        }
    }
}