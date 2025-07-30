public class SaveThePrisoner {
  public static void main(String[] args) {
    int n=4, m=6, s=2;
    System.out.println(saveThePrisoner(n, m, s));
  }

  private static int saveThePrisoner(int n, int m, int s) {
    int warnedPrisoner = s, i = 0;

    while (i < m) {
      if (warnedPrisoner == n) {
        warnedPrisoner = 1;
      } else {
        warnedPrisoner++;
      }
      i++;
    }

    return warnedPrisoner;
  }
}
