class Solution {
    public boolean checkIfExist(int[] arr) {
        if (arr == null){
            return false;
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] == 0 && arr[j] == 0) && i!=j) {
                    return true;
                }
                if (arr[j] != 0 && i!=j) {
                if (arr[i] / arr[j] == 2 && arr[i] % arr[j] == 0) {
                    return true;
                    }
                }
            }
        }
        return false;
    }
}