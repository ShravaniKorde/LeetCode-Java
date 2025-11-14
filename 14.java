class Solution {

    public String common(String s1, String s2){
        int n = Math.min(s1.length(), s2.length());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<n; i++){
            if(s1.charAt(i) == s2.charAt(i))
                sb.append(s1.charAt(i));
            else
                break;
        }
        return sb.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        for(int i = 1;i<strs.length; i++){
            res = common(res, strs[i]);
        }
        return res;
        
        
    }
}
//-------------------------------------2nd soln-----------------------------------------
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        for(int i = 0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            sb.append(first[i]);
        }
        return sb.toString();
    }
}
