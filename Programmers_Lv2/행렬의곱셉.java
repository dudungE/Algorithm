import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {

        int row = arr1.length;
        int col = arr2[0].length;
        int tmp = arr1[0].length;
        int[][] answer = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < tmp; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};
        sol.solution(arr1, arr2);
    }
}