import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {

        int a = 0, b = 0, c = 0;

        int[] aArr = {1, 2, 3, 4, 5};
        int[] bArr = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] cArr = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == aArr[i % aArr.length]) a += 1;
            if (answers[i] == bArr[i % bArr.length]) b += 1;
            if (answers[i] == cArr[i % cArr.length]) c += 1;
        }

        int[] scores = {a, b, c};
        List<Integer> answer = new ArrayList<>();

        int maxScore = Math.max(a, Math.max(b,c));

        for (int i=0; i<3; i++) {
            if(maxScore == scores[i]) answer.add(i+1);
        }
        return answer;
    }
}