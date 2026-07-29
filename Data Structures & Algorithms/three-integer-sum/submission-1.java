class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        int n = nums.length;

        for(int i=0;i<n;i++){
            if(freq.get(nums[i])>1){
                freq.put(nums[i],freq.get(nums[i])-1);
            }else{
                freq.remove(nums[i]);
            }

            for(int j=i+1;j<n;j++){
                if(freq.get(nums[j])>1){
                    freq.put(nums[j],freq.get(nums[j])-1);
                }else{
                    freq.remove(nums[j]);
                }
                
                int curr = nums[i] + nums[j];
                if(freq.containsKey(0-curr)){
                    List<Integer> cur = new ArrayList<>(Arrays.asList(nums[i],nums[j],0-curr));
                    Collections.sort(cur);
                    if(!ans.contains(cur)){
                        ans.add(cur);
                    }
                    
                }
                freq.put(nums[j],freq.getOrDefault(nums[j],0)+1);

            }
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);

        }

        return ans;
    }
}
