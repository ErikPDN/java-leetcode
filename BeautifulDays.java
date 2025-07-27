class BeatifulDays {
  public static void main(String[] args) {
    System.out.println(beautifulDays(20, 23, 6));
  }

  public static int beautifulDays(int i, int j, int k) {
    int countBeautifulDay = 0;
    for (; i <= j; i++) {
      int reverseNumber = reverseNumber(i);
      double diff = i - reverseNumber;
      double isBeautifulDay = diff / k;

      if (isBeautifulDay == Math.floor(isBeautifulDay)) {
        countBeautifulDay++;
      }
    }

    return countBeautifulDay;
  }

  private static int reverseNumber(int number) {
    int reverse = 0;
    while (number > 0) {
      int digit = number % 10;
      reverse = reverse * 10 + digit;
      number /= 10;
    }

    return reverse;
  }
}
