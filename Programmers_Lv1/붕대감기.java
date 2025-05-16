import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {

        int currentHealth = health;
        Map<Integer, Integer> attackHashMap = new HashMap<>();

        for (int[] attack : attacks) {
            attackHashMap.put(attack[0], attack[1]);
        }

        int time = 0;
        int unattackedTime = 0;

        while (true) {
            time++;
            // 데미지
            if (attackHashMap.containsKey(time)) {
                currentHealth -= attackHashMap.get(time);
                unattackedTime = 0;
            }
            if (currentHealth <= 0) return -1; // 0이하 될때 -1 return
            if (time == attacks[attacks.length - 1][0]) return currentHealth;

            // 회복
            if (attackHashMap.containsKey(time)) continue;
            currentHealth += bandage[1];
            unattackedTime++;
            if (unattackedTime == bandage[0]) { // 공격당하지 않은 시간 기준초과시 추가회복
                unattackedTime = 0;
                currentHealth += bandage[2];
            }
            if (currentHealth >= health) currentHealth = health;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] bandage = {5, 1, 5};
        int health = 30;
        int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};

        sol.solution(bandage, health, attacks);
    }
}