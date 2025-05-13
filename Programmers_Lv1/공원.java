import java.util.Arrays;

public class Solution {
    public int solution(int[] mats, String[][] park) {
    
		    // park 크기 변수로 지정하기 
        int n = park.length;
        int m = park[0].length;

        // 돗자리 크기 정렬 후 큰 값부터 검사
        Arrays.sort(mats);
        for (int idx = mats.length - 1; idx >= 0; idx--) {
            int size = mats[idx];
            // 모든 시작점 탐색
            for (int i = 0; i <= n - size; i++) {
                for (int j = 0; j <= m - size; j++) {
                    if (canPlace(i, j, size, park)) {
                        return size;
                    }
                }
            }
        }
        return -1; // 어떤 돗자리도 못 깔면 -1
    }

    // park의 (r, c)에서 size x size 돗자리 깔 수 있는지 확인
    private boolean canPlace(int r, int c, int size, String[][] park) {
        for (int i = r; i < r + size; i++) {
            for (int j = c; j < c + size; j++) {
                if (!park[i][j].equals("-1")) return false;
            }
        }
        return true;
    }
}