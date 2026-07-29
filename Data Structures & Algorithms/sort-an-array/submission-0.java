class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    public void mergeSort(int[] nums,int l,int r){
        if(l>=r){
            return;
        }

        int mid = (l + r)/2;
        mergeSort(nums,l,mid);
        mergeSort(nums,mid+1,r);
        merge(nums,l,r,mid);
    }

    public void merge(int[] nums,int l,int r,int mid){

        ArrayList<Integer> temp = new ArrayList<>();

        int s1 = l;
        int s2 = mid+1;

        while(s1<=mid && s2<=r){
            if(nums[s1]<=nums[s2]){
                temp.add(nums[s1]);
                s1++;
            }
            else{
                temp.add(nums[s2]);
                s2++;
            }

        }

        while(s1<=mid){
            temp.add(nums[s1]);
            s1++;
        }
        while(s2<=r){
            temp.add(nums[s2]);
            s2++;
        }

        for(int i=l;i<=r;i++){
            nums[i] = temp.get(i-l);
        }

    }
}