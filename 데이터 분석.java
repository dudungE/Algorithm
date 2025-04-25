import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        // 초기화
        Map<String, Integer> hm = new HashMap<>();
        hm.put("code", 0);
        hm.put("date", 1);
        hm.put("maximum", 2);
        hm.put("remain", 3);

        int filterIdx = hm.get(ext);       
        int sortIdx = hm.get(sort_by);     

        // 필터링 
        List<int[]> filtered = new ArrayList<>();
        for (int[] row : data) {
            if (row[filterIdx] < val_ext) {
                filtered.add(row);
            }
        }

        // 정렬
        filtered.sort(Comparator.comparingInt(a -> a[sortIdx]));

        // 3. List<int[]> → int[][]
        int[][] answer = new int[filtered.size()][];
        for (int i = 0; i < filtered.size(); i++) {
            answer[i] = filtered.get(i);
        }

        return answer;
    }

}