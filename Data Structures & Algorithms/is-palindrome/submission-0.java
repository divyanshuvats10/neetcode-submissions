class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();

        int n = s.length();

        for(int i=0;i<n;i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str.append(Character.toLowerCase(s.charAt(i)));
            }
            
        }

        str.toString();

        int l = 0;
        int r = str.length()-1;

        while(l<=r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}
