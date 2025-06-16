class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                temp += j;
                if (temp == n) {
                    answer++;
                    temp = 0;
                    break;
                } else if (temp > n) {
                    temp = 0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        sol.solution(15);
    }
}