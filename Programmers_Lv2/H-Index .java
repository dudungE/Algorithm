import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations); // 오름차순 정렬
        int n = citations.length;
        int h = 0;

        for (int i = 0; i < n; i++) {
            int cnt = n - i; // citations[i] 이상 인용된 논문 개수
            if (citations[i] >= cnt) {
                h = cnt;
                break;
            }
        }
        return h;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(sol.solution(citations)); // 출력: 3
    }
}
