class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        int fact=1;
        if(n==0 ||n==1){
            return 1;
        }
        while(n>1){
            fact=fact*n;
            n--;
        }
        return fact;
    }
}
