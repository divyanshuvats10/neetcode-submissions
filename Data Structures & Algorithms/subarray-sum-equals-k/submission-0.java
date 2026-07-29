class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count = 0;
        int curr = 0;

        hm.put(0,1);

        for(int i=0;i<nums.length;i++){
            curr += nums[i];
            int diff = curr - k;
            count += hm.getOrDefault(diff,0);
            hm.put(curr,hm.getOrDefault(curr,0)+1);
        }

        return count;

    }
}