import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        String commandStr = br.readLine();
        char[] commands = commandStr.toCharArray();
        
        String temp;
        for(int i=0; i<commands.length; i++) {
            if(commands[i] == 'L') {
                sb.append(sb.toString().charAt(0));
                temp = sb.toString().substring(1, sb.length());
                sb.setLength(0);
                sb.append(temp);
            } else {
                temp = sb.toString().charAt(sb.length()-1) + sb.toString().substring(0, sb.length()-1);
                sb.setLength(0);
                sb.append(temp);
            }
        }

        System.out.print(sb.toString());

    }
}