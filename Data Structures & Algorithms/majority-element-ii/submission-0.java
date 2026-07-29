class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n = nums.length;
        int n1 = -1;
        int n2 = -1;
        int count1 = 0;
        int count2 = 0;

        for(int num : nums){
            if(num == n1){
                count1++;
            }else if(num == n2){
                count2++;
            }else if(count1==0){
                n1 = num;
                count1 = 1;
            }else if(count2==0){
                n2 = num;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int num : nums){
            if(num==n1){
                count1++;
            }else if(num==n2){
                count2++;
            }
        }

        List<Integer> res = new ArrayList<>();

        if(count1>n/3) res.add(n1);
        if(count2>n/3) res.add(n2);

        return res;
    }
}