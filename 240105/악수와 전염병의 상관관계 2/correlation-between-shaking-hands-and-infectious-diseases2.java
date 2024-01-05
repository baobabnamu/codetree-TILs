import java.io.*;
import java.util.*;

class Person {
    // sick : 전염 1, 미전염 0
    int count, sick;

    Person() {}

    public Person(int count, int sick) {
        this.count = count;
        this.sick = sick;
    }
}

public class Main {
    public static final int MAX_N = 100;
    public static final int MAX_K = 250;
    public static final int MAX_THRESHOLD = 250;
    public static final int MAX_TIME = 250;

    public static void main(String[] args) throws IOException {
        // 최종적으로 어떤 사람들이 전염병에 걸려있는가?
        // 주의 : 전염된 사람끼리 만나도 전염시킨 것으로 간주함

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken()); // 개발자 수
        int K = Integer.parseInt(stk.nextToken()); // 전염병 임계값 (K번의 악수)
        int P = Integer.parseInt(stk.nextToken()); // 처음 전염병 걸린 사람
        int T = Integer.parseInt(stk.nextToken()); // 정황의 횟수

        // 1. 사람 클래스 (악수 횟수, 감염 여부) 객체 관리
        // 2. 사람 클래스 배열 생성 후 N만큼 객체 생성
        Person[] persons = new Person[N + 1];
        for(int i=1; i<=N; i++)
            persons[i] = new Person(0, 0);

        // 첫 번째 환자
        persons[P].sick = 1; 
        
        // 3. 시간 2차원 배열 (행:시간, 열:X, Y) 어느 시간에 누가 악수했는지 관리
        int[][] timeTable = new int[MAX_TIME + 1][MAX_TIME + 1];
        int startTime = MAX_TIME;
        int endTime = 0;
        for(int i=0; i<T; i++) {
            stk = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(stk.nextToken()); // 시간(초) = 악수한 타이밍
            int x = Integer.parseInt(stk.nextToken()); // 악수한 x
            int y = Integer.parseInt(stk.nextToken()); // 악수한 y

            timeTable[t][0] = x;
            timeTable[t][1] = y;

            startTime = Math.min(startTime, t);
            endTime = Math.max(endTime, t);
        }

        // 4. 시간에 맞게 시뮬레이션 진행
        for(int i=startTime; i<=endTime; i++) {
            int x = timeTable[i][0];
            int y = timeTable[i][1];

            if(x==0 || y==0) continue;

            persons[x].count++;
            persons[y].count++;

            if(persons[x].count <= K) persons[y].sick = 1;
            if(persons[y].count <= K) persons[x].sick = 1;
        }

        // 5. 사람 클래스 배열 순회해서 감염여부 반환
        for(int i=1; i<=N; i++) {
            System.out.printf("%d", persons[i].sick);
        }
    }
}