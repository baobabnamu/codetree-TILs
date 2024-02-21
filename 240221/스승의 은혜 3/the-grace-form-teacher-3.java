import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int price;
    int devlieryFee;

    Student(int price, int devlieryFee) {
        this.price = price;
        this.devlieryFee = devlieryFee;
    }

    @Override
    public int compareTo(Student o) {
        return (this.price + this.devlieryFee) - (o.price + o.devlieryFee);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        int n = sc.nextInt();
        int b = sc.nextInt();
        Student[] s = new Student[n];
        for(int i = 0; i < n; i++) {
            s[i] = new Student(sc.nextInt(), sc.nextInt());
        }

        int ans = 0;
        // 한 명의 학생에 선물 쿠폰을 쓸 때 선물 가능한 학생의 최대 명수를 구합니다.
        for(int i = 0; i < n; i++) {
            int sum = 0;
            int student = 0;
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    sum += ((s[j].price / 2) + s[j].devlieryFee);
                } else {
                    sum += (s[j].price  + s[j].devlieryFee);
                }

                if(sum > b) break;
                else student++;
            }
            ans = Math.max(ans, student);
        }

        System.out.print(ans);   
    }
}