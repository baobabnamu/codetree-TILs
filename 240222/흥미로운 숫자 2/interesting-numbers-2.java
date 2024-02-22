import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // x ~ y
        int y = sc.nextInt();

        int ans = 0;
        for(int i = x; i <= y; i++) {
            if(isSpecialNumber(i)) {
                ans++;
            }
        }

        System.out.print(ans);
    }

    private static boolean isSpecialNumber(int number) {
        String s = Integer.toString(number);
        int len = s.length();
        
        int[] digits = new int[10]; // 0 ~ 9
        for(int i = 0; i < len; i++) {
            int index = Integer.parseInt(s.substring(i, i + 1));
            digits[index]++;
        }

        int maxDigitCnt = 0;
        for(int i = 0; i < 10; i++) {
            maxDigitCnt = Math.max(maxDigitCnt, digits[i]);
        }

        int baseNum = 0;
        for(int i = 0; i < 10; i++) {
            if(digits[i] == maxDigitCnt) baseNum = i;
        }

        int cnt = 0;
        for(int i = 0; i < len; i++) {
            if(baseNum != Integer.parseInt(s.substring(i, i + 1))) cnt++;
        }

        if(cnt == 1) return true;
        return false;
    }
}

// 흥미로운 숫자의 개수 구하기
// 1. x ~ y까지 반복
// 2. 흥미로운 숫자 true/false 반환
    // 흥미로운 숫자 판별 방법 #1
    // 숫자를 분해해서 현재 위치한 수와 다음 자리에 위치한 수 비교, 다른 경우 카운팅
    // -> 반례 : 121, 131과 중간에 껴있는 수를 비교하다 보니 앞뒤로 다른 숫자가 존재해서 반례 발생.
    // 카운팅 개수 == 1 이면 흥미로운 숫자임. true 반환

    // 흥미로운 숫자 판별 방법 #2
    // 탐색 느낌으로 구현해 보기!
    // 1. 0 ~ 9를 카운트하는 배열 생성
    // 2. 각 자리에 맞게 카운팅
    // 3. 제일 많이 카운팅된 값 구하기
    // 4. 제일 많이 카운팅된 값과 동일한 자리수인 값이 baseNum임
    // 5. baseNum와 다른 숫자가 1개인 경우에만 true