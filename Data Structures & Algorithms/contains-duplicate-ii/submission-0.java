class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashSet<Integer> set = new HashSet<Integer>();
        int n = nums.length;

        for(int i=0;i<k;i++){
            if(!set.add(nums[i])){
                return true;
            }
        }

        for(int i=k;i<n;i++){
            if(!set.add(nums[i])){
                return true;
            }
            else{
                set.remove(nums[i-k]);
            }
        }

        return false;
    }
}