class Solution {
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }
        return (num%9==0) ? 9 : num % 9;  //if no. is completely divisible by 9 i.e remainder 0 then return sum as 9 else return sum as remainder i.e num%9
    }
}
