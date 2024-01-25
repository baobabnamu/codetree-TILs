import java.io.*;
import java.util.*;

public class Main {
    private static int N, M, D, S;
    private static int[][] cheezeRecord, sickRecord;
    private static int[] personStatus;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());
        D = Integer.parseInt(stk.nextToken());
        S = Integer.parseInt(stk.nextToken());

        cheezeRecord = new int[D][3];
        for(int i = 0; i < D; i++) {
            stk = new StringTokenizer(br.readLine());
            cheezeRecord[i][0] = Integer.parseInt(stk.nextToken()); // 몇 번째 사람
            cheezeRecord[i][1] = Integer.parseInt(stk.nextToken()); // 몇 번째 치즈
            cheezeRecord[i][2] = Integer.parseInt(stk.nextToken()); // t초에 먹었는가
        }

        sickRecord = new int[S][2];
        for(int i = 0; i < S; i++) {
            stk = new StringTokenizer(br.readLine());
            sickRecord[i][0] = Integer.parseInt(stk.nextToken()); // 몇 번째 사람
            sickRecord[i][1] = Integer.parseInt(stk.nextToken()); // t초에 아팠는가
        }

        
        int[] sickPersons = new int[S];
        for(int i = 0; i < S; i++) {
            sickPersons[i] = sickRecord[i][0];
        }

        int ans = 0;
        personStatus = new int[N];
        int[] spoiledCheeze = new int[M + 1]; // 상할 가능성이 있는 치즈
        for(int i = 0; i < S; i++) {
            int sickPerson = sickRecord[i][0];
            int sickTime = sickRecord[i][1];

            for(int j = 0; j < D; j++) {
                int cheezePerson = cheezeRecord[j][0];
                int cheezeType = cheezeRecord[j][1];
                int cheezeTime = cheezeRecord[j][2];

                if(sickPerson == cheezePerson && sickTime > cheezeTime) {
                    spoiledCheeze[cheezeType]++;
                }
            }
        }

        int[] spoiledCheezeAtePersons = new int[M + 1];
        for(int i = 0; i < D; i++) {
            int cheezePerson = cheezeRecord[i][0];
            int cheezeType = cheezeRecord[i][1];
            int cheezeTime = cheezeRecord[i][2];

            if(spoiledCheeze[cheezeType] == sickRecord.length) {
                spoiledCheezeAtePersons[cheezeType]++;
            }   
        }

        Arrays.sort(spoiledCheezeAtePersons);

        System.out.print(spoiledCheezeAtePersons[spoiledCheezeAtePersons.length - 1]);
        

        // 조건 1 : 아픈 사람들이 먹었던 치즈 타입이여야 함
        // 조건 2 : 아픈 시간 보다 더 예전에 먹었던 치즈여야 함

        // 1. 아픈 사람들이 누구누구 있는지 찾고, 언제 아팠는지 찾기, *아픈 사람들의 기록의 길이가 곧 아픈 사람의 수임
        // 2. 아픈 사람들 중 아픈 사람을 한 명을 선택하여 아픈 사람이 아팠던 시점 전에 먹었던 치즈 타입을 1씩 증가하면서 아픈 사람들 배열 순회
        // 3. 아픈 사람들 배열 순회 후 아픈 사람들의 기록의 길이와 동일한 치즈 타입 값이 있다면 그건 상한 치즈임(일 수 있음)
        // 4. 상한 치즈를 먹은 사람들의 최대 수를 카운팅
    }
}