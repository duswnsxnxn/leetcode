class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int num1 = nums1.length;
        int cntZero = 0;
        
        for (int i = num1 - 1; i >= 0; i--){
            if (nums1[i] != 0)
            {
                cntZero = i + 1;    
                break;
            }
        }
            
        
        for (int j = 0; j < nums2.length; j++){
            nums1[cntZero + j] = nums2[j];
        }
        
        
        int tmp = 0;
        for (int i = 0; i < nums1.length; i++){
                for (int j = 0; j < nums1.length; j++){
                if (nums1[i] < nums1[j]){
                    tmp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = tmp;
                }
            }
        }
    }
}