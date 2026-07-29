class Solution {
    public boolean isAnagram(String s, String t) {

        int n = s.length();
        int m = t.length();

        if(n!=m){
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i=0;i<n;i++){
            int a = s.charAt(i) - 'a';
            int b = t.charAt(i) - 'a';

            freq1[a]++;
            freq2[b]++;
        }

        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }

        return true;

    }
}
