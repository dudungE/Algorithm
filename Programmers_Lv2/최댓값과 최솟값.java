import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        
        StringBuilder answer = new StringBuilder();
        String[] strings = s.split(" ");
        int[] nums = new int[strings.length];
        int temp = 0;
        for (int i = 0; i < strings.length; i++) {
            temp = Integer.parseInt(strings[i]);
            nums[i] = temp;
        }

        Arrays.sort(nums);
        answer.append(nums[0]).append(" ").append(nums[nums.length - 1]);

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution("1 2 -3 4");
    }
}