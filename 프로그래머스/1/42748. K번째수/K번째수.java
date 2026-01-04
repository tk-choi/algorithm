import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> arrayList = new ArrayList<>();
        
        for (int i : array) {
            arrayList.add(i);
        }
        
        for (int[] arr : commands) {
            List<Integer> slicedList = 
                new ArrayList<>(arrayList.subList(arr[0] -1, arr[1]));
        
            Collections.sort(slicedList);

            int answerValue = slicedList.get(arr[2] - 1);
            answer.add(answerValue);
        }
        
        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}