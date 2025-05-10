class Solution {
    public int solution(int n) {
        int answer = 0;

        Loop1:
        for (int i = 2; i <= n; i++){
            for (int j = 2; j*j <= i; j++){
                if (i % j == 0) continue Loop1;
            }
            answer += 1;
        }

        return answer;
    }
}