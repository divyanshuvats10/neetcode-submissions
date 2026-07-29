class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;

        for(int num : nums){
            set.add(num);
        }

        int max = 0;

        for(int num : nums){
            int curr = 0;
            if(set.contains(num)){
                curr++;
                int cur = num+1;
                
                while(set.contains(cur)){
                    curr++;
                    cur++;
                }
            }
            
            max = Math.max(curr,max);

        }

        return max;

    }
}
