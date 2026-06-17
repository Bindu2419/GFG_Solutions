class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int temp=n;
        int rev=0;
        while(n!=0){
            int m=n%10;
            rev=rev*10+m;
            n=n/10;
        }
        return temp==rev;
    }
    
}