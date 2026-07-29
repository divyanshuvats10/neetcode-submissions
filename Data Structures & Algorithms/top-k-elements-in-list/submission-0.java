class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int n = nums.length;
        
        HashMap<Integer, Integer> count = new HashMap<>();

        ArrayList<Integer>[] freq = new ArrayList[n+1];

        for(int i=0;i<n+1;i++){
            freq[i] = new ArrayList<>();
        }

        for(int i=0;i<n;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        } 

        int[] res = new int[k];
        int index = 0;

        for(int i=n;i>0 && index<k;i--){
            for(int curr : freq[i]){
                res[index++] = curr;
            }
            if(index==k){
                return res;
            }
        }

        return res;

    }
}
