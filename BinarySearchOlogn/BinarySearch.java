class BinarySearch {
  // This solution will have the Average and worst case complexity of O(logn)
  public static int search(int nums[], int target) {
    int sidx = 0, lidx = nums.length;

    while (lidx >= sidx) {
      int pidx = (sidx + lidx) / 2;
      System.out.println(sidx + "," + lidx + "," + pidx);
      if (nums[pidx] == target) {
        return pidx;
        // break;
      }
      System.out.println("pidx num " + nums[pidx]);
      if (target > nums[pidx]) {
        sidx = pidx + 1;
      } else {
        lidx = pidx - 1;
      }
    }
    return -1;
  }

  public static void main(final String[] args) {
    int nums[] = { 1, 4, 6, 8, 9 };
    int target = 3;
    System.out.println("Found at = " + search(nums, target));
  }
}