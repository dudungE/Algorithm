import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        // 키패드 좌표 설정
        Map<Integer, int[]> keyMap = new HashMap<>();
        int num = 1;
        for (int i = 0; i < 3; i++) {        // 1~9
            for (int j = 0; j < 3; j++) {
                keyMap.put(num++, new int[]{i, j});
            }
        }
        keyMap.put(0, new int[]{3, 1});      // 0
        keyMap.put(10, new int[]{3, 0});     // * (왼손 초기 위치)
        keyMap.put(11, new int[]{3, 2});     // # (오른손 초기 위치)

        int leftPos = 10;  // 왼손 시작 위치 (*)
        int rightPos = 11; // 오른손 시작 위치 (#)

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer.append("L");
                leftPos = number;
            } else if (number == 3 || number == 6 || number == 9) {
                answer.append("R");
                rightPos = number;
            } else {
                int[] target = keyMap.get(number);
                int[] left = keyMap.get(leftPos);
                int[] right = keyMap.get(rightPos);

                int leftDist = Math.abs(target[0] - left[0]) + Math.abs(target[1] - left[1]);
                int rightDist = Math.abs(target[0] - right[0]) + Math.abs(target[1] - right[1]);

                if (leftDist < rightDist) {
                    answer.append("L");
                    leftPos = number;
                } else if (rightDist < leftDist) {
                    answer.append("R");
                    rightPos = number;
                } else {
                    if (hand.equals("right")) {
                        answer.append("R");
                        rightPos = number;
                    } else {
                        answer.append("L");
                        leftPos = number;
                    }
                }
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(sol.solution(numbers, hand));
    }
}
