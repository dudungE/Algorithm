import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            int moveI = moves[i] - 1;

            for (int j = 0; j < board.length; j++) {
                if (board[j][moveI] == 0) {
                    continue;
                }

                int doll = board[j][moveI];
                board[j][moveI] = 0;

                if (!st.isEmpty() && st.peek() == doll) {
                    st.pop();
                    answer += 2;
                } else {
                    st.push(doll);
                }

                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] board = {
            {0,0,0,0,0},
            {0,0,1,0,3},
            {0,2,5,0,1},
            {4,2,4,4,2},
            {3,5,1,3,1}
        };
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        int result = sol.solution(board, moves);
        System.out.println(result);
    }
}