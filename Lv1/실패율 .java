import java.util.*;


class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        HashMap<Integer, Double> hm = new HashMap<>();
				// difficulty 계산 후 Map에 put 
        for (int i=1; i<=N; i++) {
            int get_stage = 0;
            int unclear = 0;
            for (int j=0; j<stages.length; j++) {
                if (stages[j] >= i) {
                    get_stage += 1;
                }// end if
                if (stages[j] == i) {
                    unclear += 1;
              
                }// end j
            }

            double difficulty = (get_stage == 0 || unclear ==0 ) ? 0 : (double)unclear/get_stage;
            hm.put(i, difficulty);

        }//end i
       
				// ArrayList에 entrySet 넣고 정렬렬 후 key값만 추출 
        List<Map.Entry<Integer, Double>> entryList = new ArrayList<>(hm.entrySet());
        entryList.sort((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()));

        for (int i=0; i<entryList.size(); i++) {
            answer[i] = entryList.get(i).getKey();
        }

        return answer;
    }
    
    

    public static void main(String[] args) {

        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};


        Solution sol = new Solution();
        sol.solution(N, stages);

        System.out.println(Arrays.toString(sol.solution(N,stages)));
    }
}