import java.util.*;
import java.io.*;

public class Main {
    static int N, max = 0;
    static int[] arr, perm;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        perm = new int[N];
        visited = new boolean[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0);
        System.out.println(max);
    }

    static void dfs(int depth) {
        if (depth == N) {
            int sum = 0;
            for (int i = 0; i < N-1; i++) {
                sum += Math.abs(perm[i] - perm[i+1]);
            }
            max = Math.max(max, sum);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                perm[depth] = arr[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}