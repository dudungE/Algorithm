
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int tmp = 0;
            for (int j = 1; j <= i; j++ ) {
                if ( (i % j) == 0 ) {
                    tmp += 1;
                } // end if
            } // end j
            if( tmp > limit ) answer += power;
            else answer += tmp;
        }

        return answer;
    }
}