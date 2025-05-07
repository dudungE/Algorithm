class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        Loop:
        for (int i = 0; i < timelogs.length; i++) {
            int day = startday;
            for (int j = 0; j < 7; j++) {
                if (day != 6 && day != 7) {
                    if (toMinute(timelogs[i][j]) > toMinute(schedules[i]) + 10) {continue Loop;}
                } // end if
                day = day % 7 + 1;
            } //end j
            answer++;
        } // end i

        return answer;
    }

    public static int toMinute(int time) {
        return time / 100 * 60 + time % 100;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] schedules = {730, 855, 700, 720};
        int[][] timelogs = {{710, 700, 650, 735, 700, 931, 912},
                {908, 901, 805, 815, 800, 831, 835},
                {705, 701, 702, 705, 710, 710, 711},
                {707, 731, 859, 913, 934, 931, 905}};
        int startday = 1;


        sol.solution(schedules, timelogs, startday);
    }


}