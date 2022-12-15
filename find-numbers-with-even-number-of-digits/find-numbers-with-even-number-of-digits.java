class Solution {
    public int findNumbers(int[] nums) {
        
        int cnt=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums.length>500 || nums[i]>(int)Math.pow(10,5)){
                break;
            }
             String transStr=String.valueOf(nums[i]);
             String[] transArr=transStr.split("");
             if(transArr.length%2==0){
                 cnt++;
             }
        }
        return cnt;
    }
}