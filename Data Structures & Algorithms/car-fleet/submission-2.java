class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = speed.length;
        int[][] pairs = new int[n][2];
        Stack<Double> stack = new Stack<>();
        double[] time = new double[n];

        for(int i=0;i<n;i++){
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }

        Arrays.sort(pairs , (a,b) -> Integer.compare(b[0],a[0]));

        for(int i=0;i<n;i++){
            time[i] = (double)(target - pairs[i][0])/pairs[i][1];
        }

        for(int i=0;i<n;i++){
            if(!stack.isEmpty() && time[i]<=stack.peek()){
                continue;
            }
            stack.push(time[i]);

        }
        return stack.size();
    }
}
