class Solution {
  public static int search(int[] nums, int target, int sidx, int lidx) {
    if (lidx >= sidx) {
      int pidx = (sidx + lidx) / 2;

      if (nums[pidx] == target) {
        return pidx;
      }
      if (target < nums[pidx]) {
        System.out.println("ifff" + pidx);
        return search(nums, target, 0, pidx - 1);
      } else if (target > nums[pidx]) {
        return search(nums, target, pidx + 1, lidx);
      }
    }
    return -1;
  }

  public static void main(final String[] args) {
    int nums[] = { 1, 6, 8, 11, 15 };
    int target = -1;
    int nlen = nums.length;
    int startIdx = 0;
    int found = search(nums, target, startIdx, nlen - 1);
    System.out.println("Found at : " + found);
  }

  // This has the best time complexity of O(1) if the element is found at the pidx

}