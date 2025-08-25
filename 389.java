class Solution {
    public char findTheDifference(String s, String t) {
        int total = 0;
        for(int i = 0;i<t.length(); i++){
            total = total + t.charAt(i);  //Add ascii values of all characters in t
        }
        for(int i = 0;i<s.length(); i++){
            total = total - s.charAt(i);    //sum of ascii values of t - ascii values of s
        }
        return (char)(total); //The remaining value in total is the ascii value of the extra character
    }
}
