import java.util.HashSet;
import java.util.Set;

public class MaximumUniqueSubarray {
  public static void main(String[] args) {
    int[] nums = { 10000, 1, 10000, 1, 1, 1, 1, 1, 1 };
    System.out.println(maximumUniqueSubarray(nums)); // 17
  }

  private static int maximumUniqueSubarray(int[] nums) {
    Set<Integer> seen = new HashSet<>();
    int p1 = 0, p2 = 0;
    int maxSum = 0, currSum = 0;

    while (p2 < nums.length) {
      if (!seen.contains(nums[p2])) {
        seen.add(nums[p2]);
        currSum += nums[p2];
        maxSum = Math.max(maxSum, currSum);
        p2++;
      } else {
        seen.remove(nums[p1]);
        currSum -= nums[p1];
        p1++;
      }
    }

    return maxSum;
  }
}
