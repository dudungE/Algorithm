import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people); // 사람들을 몸무게 오름차순으로 정렬
        
        int answer = 0;
        int left = 0;
        int right = people.length - 1;
        
        while (left <= right) {
            // 가장 가벼운 사람과 가장 무거운 사람을 함께 태울 수 있는지 확인
            if (people[left] + people[right] <= limit) {
                left++; // 가벼운 사람 이동
            }
            right--;    // 무거운 사람 이동 (혼자 타든 같이 타든 항상 이동)
            answer++;   // 구명보트 사용
        }
        
        return answer;
    }
}