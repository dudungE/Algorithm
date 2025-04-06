import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int maxInt = 0;
        
        // 정렬 후 최대 값 뽑아내기
        Arrays.sort(nums);
        for (int i=nums.length-1; i>=nums.length-3; i--) {
            maxInt +=nums[i];
        }

        // 에라토스테네스의 체
        boolean[] isPrime = new boolean[maxInt+1];
        for (int i=2; i <= maxInt; i++) {
            isPrime[i] = true;
        }
    
        for (int i=2; i*i <= maxInt; i++) {
            if (isPrime[i] == true) {
                for (int j=i*i; j<=maxInt; j += i ) {
                    isPrime[j] = false;
                }
            }
        }

        // 모든 경우의 수 돌려가며 true일 경우만 answer++
        for (int i=0; i < nums.length;i++) {
            for (int j=i+1;j < nums.length;j++) {
                for(int k=j+1; k < nums.length;k++){
                    int tmp = nums[i] + nums[j] + nums[k];
                    if (isPrime[tmp] == true) answer++;
                }
            }
        }

        return answer;
    }
}