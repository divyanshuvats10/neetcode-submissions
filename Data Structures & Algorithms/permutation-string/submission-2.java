class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> freq = new HashMap<>();

        for(char c : s1.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        int l = 0;

        HashMap<Character, Integer> newFreq = new HashMap<>();

        for(int r=0;r<s2.length();r++){

            
            newFreq.put(s2.charAt(r),newFreq.getOrDefault(s2.charAt(r),0)+1);

            while(r - l + 1 > s1.length()){
                if(newFreq.get(s2.charAt(l))==1){
                    newFreq.remove(s2.charAt(l));
                }
                else{
                    newFreq.put(s2.charAt(l),newFreq.get(s2.charAt(l))-1);
                }
                l++;
            }

            if(freq.equals(newFreq)){
                return true;
            }

        }

        return false;
    }
}
