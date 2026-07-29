class Solution {
    public boolean contains(int[] arr1, int[] arr2){
        for(int i=0;i<128;i++){
            if(arr2[i]<arr1[i]){
                return false;
            }
        }
        return true;
    }

    public String minWindow(String s, String t) {

        if(s.length()<t.length()){
            return "";
        }

        int min = Integer.MAX_VALUE;
        String answer = "";

        int[] arr1 = new int[128];
        int[] arr2 = new int[128];

        for(int i=0;i<t.length();i++){
            arr1[t.charAt(i)]++;
        }
        int l = 0;

        for(int r=0;r<s.length();r++){

            arr2[s.charAt(r)]++;

            while(contains(arr1,arr2)){
                if(r-l+1 < min){
                    answer = s.substring(l,r+1);
                    min = r-l+1;
                } 
                arr2[s.charAt(l)]--;
                l++;
            }
        }

        return answer;
        
    }
}
