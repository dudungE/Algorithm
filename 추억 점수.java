import java.util.Arrays;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for (int i=0; i < photo.length; i++) {
            int result = 0;
            for (int j=0; j < photo[i].length; j++) {

                if ( Arrays.asList(name).contains(photo[i][j]) ) {
                    int idx = Arrays.asList(name).indexOf(photo[i][j]);
                    result += yearning[idx];
                }
            } // end j
            answer[i] = result;
        } // end i
        return answer;
    }
}