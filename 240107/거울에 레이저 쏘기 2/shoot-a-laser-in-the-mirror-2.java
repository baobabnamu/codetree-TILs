import java.io.*;
import java.util.*;

public class Main {
    public static int n;

    public static int mirrorCheck(char mirror, int dirNum) {
        // R : / 반시계
        // D : / 시계
        // L : / 반시계방향, \ 시계방향
        // U : / 시계방향, \ 시계방향
        if(dirNum == 1 || dirNum == 3) {
            if(mirror == '/') dirNum = (dirNum + 1) % 4;
            else dirNum = (dirNum - 1 + 4) % 4;
        } else {
            if(mirror == '/') dirNum = (dirNum - 1 + 4) % 4;
            else dirNum = (dirNum + 1) % 4;
        }
        
        return dirNum;
    }

    public static boolean inRange(int x, int y) {
        if(x >= 0 && x < n && y >= 0 && y < n) return true;
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        char[][] rect = new char[n][n];

        // 1. 맵 만들기
        for(int i=0; i<n; i++) {
            String str = br.readLine();
            char[] chars = str.toCharArray();
            for(int j=0; j<n; j++) {
                rect[i][j] = chars[j];
            }
        }

        // 2. 1 ~ 4N번 -> 인덱스로 치환하는 공식
        // 초기 위치 별로 1~3은 0, 0~max_col / 4~6은 0~max_row, max_col / 7~9는 max_row, max_col~0 / 0~max_row, 0
        // 이때, 초기 방향 설정은 1~3, 4~6, 7~9, 10~12가 각자 다름 (하, 좌, 상, 우) 순서임.
        int k = Integer.parseInt(br.readLine());

        int startRow = 0, startCol = 0, dirNum = 0;
        int[] dx = {0, 1, 0, -1}; // R D L U
        int[] dy = {1, 0, -1, 0};

        if(k <= n) {
            startRow = 0; 
            startCol = k - 1; 
            dirNum = 1;
        } else if(k <= n * 2) {
            startRow = k - n - 1;
            startCol = n - 1; 
            dirNum = 2;
        } else if(k <= n * 3) {
            startRow = n - 1; 
            startCol = (n * 3) - k; 
            dirNum = 3;
        } else if(k <= n * 4) {
            startRow = (n * 4) - k; 
            startCol = 0; 
            dirNum = 0;
        }

        // 3. 치환된 인덱스 기준으로 '/' -> 시계방향 , '\' -> 반시계방향으로 회전하고 한 칸 가기
        // 로직 (거울 체크 -> 방향 회전 -> 한 칸 이동) 반복하다가 벗어난 경우 break
        boolean isEscape = false;
        int x = startRow, y = startCol, cnt = 0;
        // System.out.printf("%d %d %d\n", x, y, dirNum);
        while(!isEscape) {
            dirNum = mirrorCheck(rect[x][y], dirNum);
            x = x + dx[dirNum];
            y = y + dy[dirNum];

            if(!inRange(x, y)) isEscape = true;
            cnt++;
        }
        System.out.printf("%d", cnt);
    }
}