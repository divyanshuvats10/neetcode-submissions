class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int n = strs.length;
        if(n==1){
            return strs[0];
        }

        StringBuilder pre = new StringBuilder();

        int a = Math.min(strs[0].length(),strs[1].length());
        int length = 0;

        for(int i=0;i<a;i++){
            if(strs[0].charAt(i)==strs[1].charAt(i)){
                pre.append(strs[0].charAt(i));
                length++;
            }
            else{
                break;
            }
        }

        for(int i=2;i<n;i++){
            int l = Math.min(strs[i].length(),length);
            pre.delete(l,length);
            length = l;
            for(int j=0;j<length;j++){
                if(strs[i].charAt(j)!=pre.charAt(j)){
                    pre.delete(j,length);
                    length = j;
                    break;
                }

            }
        }

        return pre.toString();
    }
}