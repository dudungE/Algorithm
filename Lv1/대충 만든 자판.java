import java.util.*;


class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            char[] tmp = targets[i].toCharArray();
            for(char c: tmp){   // target[i] 한글자씩 반복

                ArrayList<Integer> temp = new ArrayList();

                for (int j = 0; j < keymap.length; j++) {
                    temp.add(keymap[j].indexOf(c));

                }// end j


                boolean isAllminus = true;
                for (int a : temp) {
                    if (a >= 0) isAllminus = false;
                }   // -1만 포함되있는지 여부 확인

                if (isAllminus) answer[i] += -1;
                else {
                    Iterator<Integer> iterator = temp.iterator();
                    while (iterator.hasNext()) {
                        if(iterator.next().equals(-1)){
                            iterator.remove();
                        }
                    }// end while
                    answer[i] += Collections.min(temp) + 1;
                } // end if
            }
        }// end i
        return answer;
    }


}
