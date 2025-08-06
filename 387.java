class Solution {
    public int firstUniqChar(String s) {
        int freq[]=new int[26];
        char chars[]= s.toCharArray();

        for(char c: chars){
            freq[c - 'a']++;
        }
        for(int i=0;i<chars.length;i++){
            if(freq[chars[i]-'a']==1){// i in chars[i]	        means the i-th character of the string
                                      // freq[chars[i] - 'a']	means the frequency count of that character
                                      // freq[i]	            means the i-th alphabet letter (i.e., 'a' + i)
                return i;
            }
        }
        return -1;
    }
}
