class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }

        int[] ans = new int[2];

        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i]) && i!=map.get(target-nums[i])){
                int j = map.get(target-nums[i]);
                if(i<j){
                    ans[0] = i;
                    ans[1] = j;
                }
                else{
                    ans[0] = j;
                    ans[1] = i;
                }
            }
        }

        return ans;

    }
}
