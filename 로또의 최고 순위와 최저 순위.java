import java.util.*;


class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
				int sameNum = 0;
        int zeroNum = 0;
        List<Integer> listWinNum = new ArrayList();
        List<Integer> listLottos = new ArrayList();

        // arraylist에 입력
        for(int i=0; i<lottos.length; i++) {
            listLottos.add(lottos[i]);
            listWinNum.add(win_nums[i]);
        }

        // 같은 숫자, 0의 개수 구하기 
        for (int i = 0; i < listWinNum.size(); i++) {
            if (listLottos.get(i) == 0) {
                zeroNum++;
            }
            if (listLottos.contains(listWinNum.get(i))) {
                sameNum++;
            }
        }

        answer[0] = getGrade(sameNum + zeroNum);
        answer[1] = getGrade(sameNum);

        return answer;
    }
    
    // 순위 구하기 
    public int getGrade(int num) {
        switch (num) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }

}
