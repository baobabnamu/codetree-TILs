import java.util.*;

class Student implements Comparable<Student> {
    int price;
    int devFee;

    Student(int price, int devFee) {
        this.price = price;
        this.devFee = devFee;
    }

    @Override
    public int compareTo(Student o) {
        return (this.price + this.devFee) + (o.price + o.devFee);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        Student[] s = new Student[n];
        for(int i = 0; i < n; i++) {
            s[i] = new Student(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(s);

        int ans = 0;
        for(int i = 0; i < n; i++) {
            int sum = 0;
            int student = 0;
            for(int j = 0; j < n; j++) {
                int tmp = 0;
                if(i == j) {
                    tmp = ((s[j].price / 2) + s[j].devFee);
                } else {
                    tmp = (s[j].price + s[j].devFee);
                }

                if(sum + tmp <= b) {
                    student++;
                    sum += tmp;
                }
            }
            ans = Math.max(ans, student);
        }

        System.out.print(ans);
    }
}