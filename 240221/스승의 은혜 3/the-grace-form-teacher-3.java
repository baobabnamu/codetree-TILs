import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

class Student implements Comparable<Student> {
    int price;
    int deliveryFee;

    public Student(int price, int deliveryFee) {
        this.price = price;
        this.deliveryFee = deliveryFee;
    }

    @Override
    public int compareTo(Student o) {
        return (this.price / 2 + this.deliveryFee) - (o.price / 2 + o.deliveryFee);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
        Student[] s = new Student[n];
		int max = 0;

        for(int i = 0; i < n; i++) {
            s[i] = new Student(sc.nextInt(), sc.nextInt());
        }

		// 가격과 배송비의 합으로 정렬
        Arrays.sort(s);

		for(int i = 0; i < n; i++){
			int sum = 0;
			int count = 0;
			for(int j = 0; j < n; j++){
				int temp = 0;
				if(i == j){
					temp = (s[j].price / 2) + s[j].deliveryFee;
				}else{
					temp = s[j].price + s[j].deliveryFee;
				}
				if(sum + temp <= b){
					sum += temp;
					count++;
				}
			}
			max = Math.max(max, count);
		}

		System.out.println(max);
    }
}