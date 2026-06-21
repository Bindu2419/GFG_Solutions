import java.util.*;

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {

        Arrays.sort(arr);

        int repeating = -1;
        int missing = -1;

        // find repeating
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                repeating = arr[i];
            }
        }

        // find missing
        int expected = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == expected) {
                expected++;
            } 
            else if (arr[i] > expected) {
                missing = expected;
                break;
            }
        }

        if (missing == -1) {
            missing = expected;
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(repeating);
        res.add(missing);

        return res;
    }
}