import java.util.*;

public class Main {
    private static String baseString;
    private static int n;
    private static List<String> substrList = new ArrayList<>();

    public static void main(String[] args) {

        // 1. 가능한 부분문자열의 길이 값을 구하기
        // 2. 부분문자열 생성 (부분 문자열 길이만큼 자른 후)
        // 3. 해당 문자열이 부분문자열이 맞다면 ans 값을 현재 반복하고 있던 길이 값으로 갱신
        // 4. 부분문자열이 맞으면 계속 갱신 됐으므로 +1만 하면 안 맞는 경우에서의 최솟값임.

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String baseString = sc.next();

        int ans = 0;
        for(int i = 1; i <= 100; i++) {
            boolean isPossible = false;
            for(int j = 0; j < n; j++) {
                if(j + i <= n && !isPossible) {
                    String substr = baseString.substring(j, j + i);
                    if(substrList.contains(substr)) {
                        ans = substr.length();
                        isPossible = true;
                    }
                    substrList.add(substr);
                }
            }
        }
        System.out.print(ans + 1);
    }
}