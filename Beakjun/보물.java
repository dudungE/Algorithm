import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int sum = 0;

		int[] A = new int[num];
		int[] B = new int[num];

		String[] aInput = br.readLine().split(" ");
		String[] bInput = br.readLine().split(" ");

		for (int i = 0; i < num; i++) {
			A[i] = Integer.parseInt(aInput[i]);
			B[i] = Integer.parseInt(bInput[i]);
		}

		Arrays.sort(A);
		Arrays.sort(B);

		for (int i = 0; i < num; i++) {
			sum += A[i] * B[num - 1 - i];
		}

		System.out.println(sum);
	}
}
