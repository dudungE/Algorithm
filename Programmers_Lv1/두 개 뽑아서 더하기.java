import java.util.*;

class Solution {
    public List<Integer> solution(int[] numbers) {

        HashSet<Integer> answer = new HashSet<Integer>();

        for (int i=0; i < numbers.length;i++) {
            for(int j=i+1; j < numbers.length; j++) {
                answer.add(numbers[i] + numbers[j]);
            }
        }

        List<Integer> last_answer = new ArrayList<>(answer);
        Collections.sort(last_answer);

        return last_answer;

    }
}