import java.util.Arrays;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";

        int[] freqX = new int[10];
        int[] freqY = new int[10];
        for (char c : X.toCharArray()) {
            freqX[c - '0']++;
        }
        for (char c : Y.toCharArray()) {
            freqY[c - '0']++;
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 9; i >= 0; i--) {
            int sameFreq = Math.min(freqX[i], freqY[i]);
            for (int j = 0; j < sameFreq; j++) { sb.append(i); } // end j
        }// end i

        if (sb.toString().length() == 0) return "-1";
        else if (sb.toString().matches("0+")) return "0";

        return sb.toString();
    }
}