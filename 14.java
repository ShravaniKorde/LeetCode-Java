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
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        int index = 0; //start from 0th index
        while(index < str1.length()){
            if(str1.charAt(index) == str2.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }

        return index == 0 ? "" : str1.substring(0, index); // if index is 0 return nothig else return substring from 0 till that index 
    }
}
