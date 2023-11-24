class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashMap<Character,Integer> map=new HashMap<>();
        int l=0,r=0,len=0;
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
               l=Math.max(map.get(s.charAt(r))+1,l);
            }
            
             
             len=Math.max(len,r-l+1);
            map.put(s.charAt(r),r);
            r++;
            
        }
        return len;
    }
}