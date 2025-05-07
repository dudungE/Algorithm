import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {

        TreeSet<Integer> ts = new TreeSet<>();
        TreeSet<Integer> ts2 = new TreeSet<>();
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    ts.add(i); ts2.add(j);
                }
            }
        }
        
        int[] answer = {ts.first(), ts2.first(), ts.last() + 1, ts2.last() + 1};
        
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        sol.solution(wallpaper);
    }
}