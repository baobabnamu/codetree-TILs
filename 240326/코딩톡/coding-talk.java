import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int P = sc.nextInt();

        char[] personList = new char[M + 1];
        int[] readList = new int[M + 1];

        for (int i = 1; i <= M; i++) {
            char c = sc.next().charAt(0);
            int u = sc.nextInt();

            personList[i] = c;
            readList[i] = u;
        }

        // A ~ n
        boolean[] readPerson = new boolean[N];

        for (int i = 1; i <= P; i++) {
            if (readList[i] == 0) {
                Arrays.fill(readPerson, true);
            } else {
                if (readList[i - 1] == readList[i]) {
                    int idx1 = personList[i - 1] - 'A';
                    int idx2 = personList[i] - 'A';

                    readPerson[idx1] = true;
                    readPerson[idx2] = true;
                } else {
                    Arrays.fill(readPerson, false);
                    int idx2 = personList[i] - 'A';

                    readPerson[idx2] = true;
                }
            }
        }

        for (int i = P; i <= M; i++) {
            char person = personList[i];

            int idx = person - 'A';

            readPerson[idx] = true;
        }

        if (readList[P] != 0) {
            for (int i = 0; i < readPerson.length; i++) {
                if (!readPerson[i]) {
                    System.out.printf("%s ", (char) ((char) i + 'A'));
                }
            }
        }
    }
}