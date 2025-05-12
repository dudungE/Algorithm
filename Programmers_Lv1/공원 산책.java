class Solution {
    public int[] solution(String[] park, String[] routes) {
        int sx = 0, sy = 0;
        char[][] arr = new char[park.length][park[0].length()];
        
        // 시작 위치 찾기
        for(int i = 0; i < park.length; i++){
            arr[i] = park[i].toCharArray();
            if(park[i].contains("S")){
                sy = i;
                sx = park[i].indexOf("S");
            }
        }
    
        // 명령 처리
        for(String st : routes){
            String way = st.split(" ")[0];
            int len = Integer.parseInt(st.split(" ")[1]);
            int nx = sx, ny = sy;
            
            for(int i = 0; i < len; i++){
                if(way.equals("E")) nx++;
                if(way.equals("W")) nx--;
                if(way.equals("S")) ny++;
                if(way.equals("N")) ny--;
                // 범위 및 장애물 체크
                if(nx >=0 && ny >=0 && ny < arr.length && nx < arr[0].length){
                    if(arr[ny][nx] == 'X') break;
                    if(i == len-1){
                        sx = nx;
                        sy = ny;
                    }
                }
            }
        }
        return new int[]{sy, sx};
    }
}
