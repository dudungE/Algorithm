import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {

        Map<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            hm.put(players[i], i);
        }
        
        for (int i = 0; i < callings.length; i++) {
            String calledPlayer = callings[i];
            int calledPlayerIdx = hm.get(calledPlayer);
            String targetPlayer = players[calledPlayerIdx - 1];

            if (calledPlayerIdx > 0) {
                swap(players, calledPlayerIdx, calledPlayerIdx - 1);
                hm.put(calledPlayer, hm.get(calledPlayer) - 1);
                hm.put(targetPlayer, hm.get(targetPlayer) + 1);
            }
        }
        
        return players;
    }

    public static void swap(String[] string, int i, int j) {
        String tmp = string[i];
        string[i] = string[j];
        string[j] = tmp;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        sol.solution(players, callings);
    }
}