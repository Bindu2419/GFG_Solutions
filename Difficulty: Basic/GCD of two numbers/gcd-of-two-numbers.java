class Solution {
    public static int gcd(int a, int b) {
        // code here
        int temp=0;
        while(b!=0){
            temp=b;
            b=a%b;
            a=temp;
        }
        return temp;
    }
}
