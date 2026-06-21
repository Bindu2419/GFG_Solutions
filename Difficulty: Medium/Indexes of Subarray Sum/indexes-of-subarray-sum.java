class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {

        ArrayList<Integer> res = new ArrayList<>();

        int start = 0;
        long sum = 0; // use long for safety

        for (int end = 0; end < arr.length; end++) {

            sum += arr[end];

            while (sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                res.add(start + 1); // 1-based index
                res.add(end + 1);
                return res;
            }
        }

        res.add(-1);
        return res;
    }
}