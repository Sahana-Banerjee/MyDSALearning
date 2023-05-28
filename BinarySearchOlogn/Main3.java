class Solution {
    public static int search(int[] nums, int target) {
        int numLength = nums.length;
        int pivot = numLength/2;
        int idx = pivot-1;
        if(nums[idx] == target)
            return idx;
        else {
            if(nums[idx] > target){
                idx = (pivot)/2 - 1;
                idx = search(nums,target);
            } else if(nums[idx] < target) {
                idx = (pivot+1)/2 -1;
                idx = search(nums,target);
            }
            return idx;
        }
        // binarySearch(nums,target,pivot-1);
    }

    public static void main(final String[] args){
        int nums[] = {-1,0,3,5,9,12};
        int target = 9;
        int found = search(nums, target);
        System.out.println("Found at : "+found);
    }
    
}