class Solution {
    public void duplicateZeros(int[] arr) {
       
        int length = arr.length-1;
        int dups = 0;
        
        for (int left = 0; left <=length - dups; left++){
            
            if (arr[left] == 0){
                
                if (left == length - dups){
                    arr[length] = 0;
                    length -= 1;
                    break;
                }
                dups++;
            }
        }
        
        int last = length - dups;
        
        for (int i = last; i >= 0; i--){
            if(arr[i] == 0) {
                arr[i + dups] = 0;
                dups--;
                arr[i + dups] = 0;
            } else {
                arr[i + dups] = arr[i];
            }
            }
        }
       
    }
