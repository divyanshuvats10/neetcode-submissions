class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];

        Deque<Integer> dq = new ArrayDeque<>();

        int l = 0;
        int r = 0;
        while(r < n){
            
            while(!dq.isEmpty() && nums[dq.getLast()] < nums[r]){
                dq.removeLast();
            }
            dq.addLast(r);
            if(l > dq.getFirst()){
                dq.removeFirst();
            }
            if((r+1) >= k){
                res[l] = nums[dq.getFirst()];
                l++;
            }
            r++;
        }
        
        return res;

    }

    
}
