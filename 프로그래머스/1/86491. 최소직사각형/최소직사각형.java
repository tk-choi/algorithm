class Solution {
    public int solution(int[][] sizes) {
    	int maxW = 0;
        int maxH = 0;
        
        for (int i=0; i < sizes.length; i++) {
            int[] temp = sizes[i];
            
            if (temp[0] > temp[1]) {
                if (maxW < temp[0]) {
                    maxW = temp[0];    
                }
                
                if (maxH < temp[1]) {
                    maxH = temp[1];
                }
            } else {
                if (maxW < temp[1]) {
                    maxW = temp[1];    
                }
                
                if (maxH < temp[0]) {
                    maxH = temp[0];    
                }
            }
        }
        
        return maxW * maxH;
    }
}