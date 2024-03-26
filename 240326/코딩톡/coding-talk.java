import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt(); int p = sc.nextInt();
        int[][] messages = new int[m][2];
        HashMap<Integer, Integer> store = new HashMap<>();
        for(int i = 0; i < m; i++) {
            messages[i][0] = (int)sc.next().charAt(0);
            messages[i][1] = sc.nextInt();
            store.put(messages[i][0], messages[i][1]);
        }

        if(p == 1) {
            return;
        }

        int[] messagers = new int[m];
        for(int i = 0; i < m; i++) {
            messagers[i] = 'A' + i;
        }

        int[] messagesSenders = new int[m];
        for(int i = p - 1; i < m; i++) {
            messagesSenders[i] = messages[i][0];
        }

        int[] answers = new int[m];
        for(int i = 0; i < m; i++) {
            boolean isRead = false;
            for(int j = 0; j < m; j++) {
                if(messagers[i] == messagesSenders[j]) {
                    isRead = true;
                }
            }

            if(!isRead) {
                answers[i] = messagers[i];
            }
        }

        for(int people : answers) {
            if(people != 0) {
                System.out.printf("%c ", people);
            }
        }
    }
}