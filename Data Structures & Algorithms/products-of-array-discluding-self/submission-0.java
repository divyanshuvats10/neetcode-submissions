class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int n = nums.length;

        boolean zero = false;
        boolean doubleZero = false;

        for(int i=0;i<n;i++){

            if(zero){
                if(nums[i]==0){
                    doubleZero = true;
                }
            }

            if(nums[i] == 0){
                zero = true;
                continue;
            }

            product *= nums[i];

        }

        int[] ans = new int[n];
        if(doubleZero){
            return ans;
        }

        if(!zero){
            for(int i=0;i<n;i++){
                ans[i] = product / nums[i];
            }
        }else{
            for(int i=0;i<n;i++){
                if(nums[i]==0){
                    ans[i] = product;
                }else{
                    ans[i] = 0;
                }
            }
        }
        

        return ans;
    }
}  
