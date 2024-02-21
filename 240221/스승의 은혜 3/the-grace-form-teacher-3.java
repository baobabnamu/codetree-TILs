import java.util.*;

class Student implements Comparable<Student> {
    int price;
    int deliveryFee;

    public Student(int price, int deliveryFee) {
        this.price = price;
        this.deliveryFee = deliveryFee;
    }

    @Override
    public int compareTo(Student s) {
        return (this.price + this.deliveryFee) - (s.price + s.deliveryFee);
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
            int budget = b;
            int cnt = 0;
            for(int j = 0; j < n; j++) {
                if(i == j) budget -= ((s[j].price / 2) + s[j].deliveryFee);
                else budget -= (s[j].price + s[j].deliveryFee);

                if(budget >= 0) cnt++;
                else break;
            }
            ans = Math.max(ans, cnt);
        }

        System.out.print(ans);
    }
}