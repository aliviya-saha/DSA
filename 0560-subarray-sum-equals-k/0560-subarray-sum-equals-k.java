class Solution {
    public int subarraySum(int[] nums, int k) {
        int presum=0, c=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            presum+=nums[i];
          int  remove=presum-k;
            c+=map.getOrDefault(remove,0);
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
                return c;
    }
}