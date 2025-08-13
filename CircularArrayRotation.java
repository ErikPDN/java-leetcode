import java.util.ArrayList;
import java.util.List;

public class CircularArrayRotation {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(List.of(3, 4, 5));
    List<Integer> queries = new ArrayList<>(List.of(1, 2));
    System.out.println(circularArrayRotate(list, 2, queries));
  }

  private static List<Integer> circularArrayRotate(List<Integer> a, int k, List<Integer> queries) {
    int i = 0;
    while (i < k) {
      int rotateElement = a.removeLast();
      a.addFirst(rotateElement);
      i++;
    }

    List<Integer> resultArr = new ArrayList<>();
    for (int j = 0; j < k; j++) {
      int index = queries.get(j);
      resultArr.add(a.get(index));
    }

    return resultArr;
  }
}
