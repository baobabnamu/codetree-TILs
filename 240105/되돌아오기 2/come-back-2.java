import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String commands = br.readLine();
        char[] commandsToCharArr = commands.toCharArray();

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int x = 0, y = 0, dirNum = 0, answer = 0;
        boolean isFind = false;

        for(char command : commandsToCharArr) {
            if(command == 'F') {
                x += dx[dirNum];
                y += dy[dirNum];
            } else if(command == 'R') {
                dirNum = (dirNum + 1) % 4;
            } else {
                dirNum = (dirNum - 1 + 4) % 4;
            }
            answer++;

            if(x == 0 && y == 0) {
                isFind = true;
                break;
            }
        }

        if(isFind) System.out.print(answer);
        else System.out.print("-1");
    }
}