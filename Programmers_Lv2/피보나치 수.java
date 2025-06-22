class Solution {
    public long solution(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] fibo = new int[n + 1];
        fibo[1] = 1;
        fibo[2] = 2;

        for (int i = 3; i <= n; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 1234567;
        }

        return fibo[n];
    }
}
