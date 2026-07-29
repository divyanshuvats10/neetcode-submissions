class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int i = 0;
        int r = nums.length - 1;

        while(i<=r){
            if(nums[i]==0){
                swap(nums,l,i);
                i++;
                l++;
            }
            else if(nums[i]==1){
                i++;
            }
            else if(nums[i]==2){
                swap(nums,i,r);
                r--;
            }
        }


    }

    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}