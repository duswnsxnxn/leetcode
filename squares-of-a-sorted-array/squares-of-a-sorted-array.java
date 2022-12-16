class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] newArr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(
              nums.length>(int)Math.pow(10,4)
              || (nums[i]<-((int)Math.pow(10,4))
              && nums[i]>(int)Math.pow(10,4))
              ){
                break;
            }
            newArr[i]=(int)Math.pow(nums[i],2);
        }
        
        return sorting(newArr);
    }
    
    
    public static int[] sorting(int[] nums){
        int min=0;
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    min=nums[i];
                    nums[i]=nums[j];
                    nums[j]=min;
                }
            }
            }
        return nums;
        }
    
    }
