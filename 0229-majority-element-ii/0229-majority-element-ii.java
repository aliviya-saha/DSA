class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1=Integer.MIN_VALUE, ele2=Integer.MIN_VALUE,c1=0,c2=0;
        for(int i=0;i<nums.length;i++){
            if(c1==0 && nums[i]!=ele2){
                ele1=nums[i];
                c1=1;
            }else if(c2==0 && nums[i]!=ele1){
                ele2=nums[i];
                c2=1;
            }
            else if(ele1==nums[i]){
                c1++;
            }else if(ele2==nums[i]){
                c2++;
                
            }else{
                c1--;
                c2--;
            }
        }
         List<Integer> ls = new ArrayList<>(); 
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ele1) cnt1++;
            if (nums[i] == ele2) cnt2++;
        }

        int mini = (int)(nums.length/ 3)+1;
        if (cnt1 >= mini) ls.add(ele1);
        if (cnt2 >=mini) ls.add(ele2);
        
        Collections.sort(ls);
        return ls;
    }
}