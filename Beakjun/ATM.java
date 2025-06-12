import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] times = new int[n];

        // 시간 입력
        for (int i = 0; i < n; i++) {
            times[i] = sc.nextInt();
        }

        // 정렬
        Arrays.sort(times);

        int total = 0;
        int accumulate = 0;

        for (int i = 0; i < n; i++) {
            accumulate += times[i];
            total += accumulate;
        }

        System.out.println(total);
    }
}
