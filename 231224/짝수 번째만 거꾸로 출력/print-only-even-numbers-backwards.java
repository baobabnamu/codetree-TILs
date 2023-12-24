import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> stack = new Stack<>();

        for(int i=1; i<=s.length(); i++) {
            if(i%2==0) {
                stack.push(s.charAt(i-1));
            }
        }

        while(!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}