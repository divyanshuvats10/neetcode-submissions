class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;

        int l = 0;
        int r = n-1;

        int area = 0;

        while(l<r){
            int curr = Math.min(heights[l],heights[r]) * (r - l);
            area = Math.max(curr,area);

            if(heights[l]<=heights[r]){
                l++;
            }else{
                r--;
            }

        }
        return area;
    }
}
