import java.util.Arrays;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] scores = new int[3];
        int idx = -1;

        for(int i=0; i<dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if (Character.isDigit(c)) {     // 숫자 case(숫자인 경우 idx++      
                if (dartResult.charAt(i) == '1' && dartResult.charAt(i+1) == '0') {
                    idx ++;  
                    scores[idx] = 10;
                    i++;  // 뒤의 0까지 사용했으므로 i++
                    continue;
                }  else {
                    idx++;
                    scores[idx] = c - '0';  ;   // int로 치환
                    continue;
                }

            } else if (Character.isLetter(c)) { //문자 case
                System.out.println(c);
                switch (c) {
                    case 'D':
                        scores[idx] = (int)Math.pow(scores[idx], 2);
                        break;
                    case 'T':
                        scores[idx] = (int)Math.pow(scores[idx], 3);
                        break;
                }
            } else {    // 특수문자 case
                System.out.println(c);
                switch (c) {
                    case '*':
                        if (idx==0) {
                            scores[idx] *= 2;
                        }   else {
                            scores[idx] *= 2;
                            scores[idx-1] *= 2;
                        }
                        break;
                    case '#':
                        scores[idx] *= -1;
                        break;
                }
            }
        }   // end i

        return Arrays.stream(scores).sum();
    }
}