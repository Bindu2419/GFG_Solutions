class Solution {
    int majorityElement(int arr[]) {

        int candidate = arr[0];
        int count = 1;

        // Step 1: find candidate
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }

        // Step 2: verify candidate
        int freq = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate) {
                freq++;
            }
        }

        return (freq > arr.length / 2) ? candidate : -1;
    }
}