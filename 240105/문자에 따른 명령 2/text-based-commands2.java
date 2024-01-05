import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String commands = br.readLine();
        char[] commandsToCharArr = commands.toCharArray();

        int nx = 0;
        int ny = 0;

        // 시계방향
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        int dirNum = 0;

        for(char command : commandsToCharArr) {
            if(command == 'L') {
                dirNum = (dirNum - 1 + 4) % 4;
            } else if (command == 'R') {
                dirNum = (dirNum + 1) % 4;
            } else {
                nx += dx[dirNum];
                ny += dy[dirNum];
            }
        }

        System.out.printf("%d %d", nx, ny);
    }
}