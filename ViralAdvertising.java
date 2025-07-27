class ViralAdvertising {

  public static void main(String[] args) {
    System.out.println(viralAdvertising(5));
  }

  public static int viralAdvertising(int n) {
    int totalLikes = 0;
    int countPeople = 5;

    for (int i = 1; i <= n; i++) {
      countPeople = (int) Math.floor((countPeople / 2));
      totalLikes += countPeople;
      countPeople = countPeople * 3;
    }

    return totalLikes;
  }
}
