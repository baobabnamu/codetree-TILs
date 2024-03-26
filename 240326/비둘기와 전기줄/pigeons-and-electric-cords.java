import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> store = new HashMap<>();

        int ans = 0;
        for(int i = 0; i < n; i++) {
            int number = sc.nextInt();
            int location = sc.nextInt();
            if(store.containsKey(number)) {
                int tempLocation = store.get(number);
                if(tempLocation != location) {
                    ans++;
                }
            }
            store.put(number, location);
        }

        System.out.print(ans);
    }
}