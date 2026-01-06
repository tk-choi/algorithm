import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int h = 0;
        
        // 내림차순 정렬을 위해 Wrapper로 변환
        Integer[] citationsBoxced = Arrays.stream(citations)
            .boxed()
            .toArray(Integer[]::new);

        // 내림차순 정렬
        Arrays.sort(citationsBoxced, Collections.reverseOrder());
        
        for (int i=0; i < citationsBoxced.length; i++) {
            if (citationsBoxced[i] >= i+1) {
                h = i+1;
            } else {
                break;
            }
        }
        
        return h;
    }
}