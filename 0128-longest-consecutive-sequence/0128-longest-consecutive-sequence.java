class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=0)
            return 0;
        Set<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int longest=1, c=0;
        for(int it: set){
            if(!set.contains(it-1)){
                c=1;
                int x=it;
                while(set.contains(x+1)){
                    x=x+1;
                    c++;
                }
                longest=Math.max(longest,c);
            }
        }
        return longest;
    }
}