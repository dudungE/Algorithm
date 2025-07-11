import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        char prevLastChar = words[0].charAt(words[0].length() - 1);

        for (int i = 1; i < words.length; i++) {
            String curr = words[i];

            if (set.contains(curr) || prevLastChar != curr.charAt(0)) {
                int person = (i % n) + 1;     
                int turn = (i / n) + 1;     
                return new int[]{person, turn};
            }

            set.add(curr);
            prevLastChar = curr.charAt(curr.length() - 1);
        }
        return new int[]{0, 0};
    }
}
