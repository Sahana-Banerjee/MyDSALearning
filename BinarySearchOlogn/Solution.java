class Solution {
  public static int search(int[] nums, int target, int sidx, int lidx) {
    int pidx = (sidx + lidx) / 2;

    if (nums[pidx] == target) {
      return pidx;
    }
    if (target < nums[pidx]) {
      return search(nums, target, 0, pidx - 1);
    } else if (target > nums[pidx]) {
      return search(nums, target, pidx + 1, nums.length - 1);
    }
    return -1;
  }

  public static void main(final String[] args) {
    int nums[] = { -1, 0, 3, 5, 9, 12 };
    int target = 2;
    int nlen = nums.length;
    int startIdx = 0;
    // int piIdx = nlen / 2 - 1;
    int found = search(nums, target, startIdx, nlen - 1);
    System.out.println("Found at : " + found);
  }

}