class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i+1]>nums[i]){
                index=i;
                break;
            }
        }
        if(index==-1){
             reverse(nums,0,nums.length-1);
        } 
        else{
            
        
        for(int i=nums.length-1;i>=index;i--){
            if(nums[i]>nums[index])
            {
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                break;
            }
        }
        reverse(nums,index+1,nums.length-1);
      }     
    }
    public void reverse(int [] nums, int low,int high){
        int temp=0;
        while(low<=high){
            temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
    }
}