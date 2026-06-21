class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                res.add(arr[i]);
            }
        }
        return res;
    }
}