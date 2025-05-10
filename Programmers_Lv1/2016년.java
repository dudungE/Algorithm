class Solution {
    public String solution(int a, int b) {
        
        int tmp_num = -1;
        int[] num_days = {31, 29, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 30};
        String[] days = {"FRI","SAT" ,"SUN","MON","TUE","WED","THU"};

        for (int i=0; i < a-1; i++) tmp_num += num_days[i];
        int idx = (tmp_num + b) % 7;

        return days[idx];
    }
}

