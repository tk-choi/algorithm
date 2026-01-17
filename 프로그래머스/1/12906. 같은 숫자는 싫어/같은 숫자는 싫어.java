import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int next = i+1 < arr.length ? arr[i+1] : -1;
            
            if (current != next) {
                list.add(current);
            }
        }
        
        // List -> int[] 형 변환
        int[] resultArr = list.stream().mapToInt(Integer::intValue).toArray();
        
        return resultArr;
    }
}