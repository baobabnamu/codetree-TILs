import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int cnt = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '(')  {
                for(int j=i+1; j<str.length(); j++) {
                    if(str.charAt(i) == '(' && str.charAt(j) == ')') 
                        cnt++;
                }
            }
        }
        System.out.print(cnt);
        
    }
}