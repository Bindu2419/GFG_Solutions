import java.util.ArrayList;

class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        if (arr.length == 0) {
            return result;
        }

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        for (int j = 0; j <= i; j++) {
            result.add(arr[j]);
        }

        return result;
    }
}