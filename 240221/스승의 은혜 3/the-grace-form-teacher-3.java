import java.io.*;
import java.util.*;

class Student {
    int present;
    int deliveryFee;
    int cost;

    public Student(int present, int deliveryFee, int cost) {
        this.present = present;
        this.deliveryFee = deliveryFee;
        this.cost = cost;
    }
}

class StudentComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.cost - s2.cost;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());

        Student[] students = new Student[n];

        for(int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());
            int present = Integer.parseInt(stk.nextToken());
            int deliveryFee = Integer.parseInt(stk.nextToken());
            int cost = (present / 2) + deliveryFee;

            students[i] = new Student(present, deliveryFee, cost);
        }

        // 정렬
        Arrays.sort(students, new StudentComparator());

        // 이중 반복문
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int budget = b;
            int cnt = 0;
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    budget -= students[j].cost;
                } else {
                    budget -= (students[j].present + students[j].deliveryFee);
                }

                if(budget >= 0) cnt++;
                else break;
            }
            ans = Math.max(ans, cnt);
        }

        System.out.print(ans);
    }
}