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
