public class PowerOfTwo {
  public static void main(String[] args) {
    int n = 16;
    System.out.println("Result: " + isPowerOfTwo(n));
    System.out.println("Result: " + isPowerOfTwoWithLog(n));
  }

  private static boolean isPowerOfTwo(int n) {
    if (n <= 0)
      return false;

    while (n % 2 == 0) {
      n /= 2;
    }

    return n == 1;
  }

  private static boolean isPowerOfTwoWithLog(int n) {
    if (n <= 0)
      return false;

    return Math.floor(Math.log(n)) == Math.log(n);f
  }
}
