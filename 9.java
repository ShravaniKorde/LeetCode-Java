class Solution {
    public boolean isPalindrome(int x) {

        int rev = 0;
        int dup = Math.abs(x);

        while(x!=0){
            int ld = x%10;
            rev = (rev * 10) + ld;
            x = x/10;
        }
        if(dup == rev){
            return true;
        }
        return false;
    }
}
