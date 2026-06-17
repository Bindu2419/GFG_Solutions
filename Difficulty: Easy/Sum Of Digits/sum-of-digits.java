class Solution {
    static int sumOfDigits(int n) {
        // code here
        int sum=0;
        while(n!=0){
            int m=n%10;
            sum+=m;
            n=n/10;
        }
        return sum;
    }
}
