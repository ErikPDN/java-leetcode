import java.util.ArrayList;
import java.util.List;

public class SequenceEquation {

  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>(List.of(4, 3, 5, 1, 2)); 
    System.out.println(sequenceEquation(arr));
  } 

  public static List<Integer> sequenceEquation(List<Integer> p) {
    List<Integer> resArray = new ArrayList<>();


    for (int i = 1; i <= p.size(); i++) {
      int midPos = searchValue(i, p);
      int finalPos = searchValue(midPos, p);
      resArray.add(finalPos);
    }

    return resArray;

  }

  private static int searchValue(int targetVal, List<Integer> list) {
    int pos = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == targetVal) {
        pos = i;
      } 
    }
    return pos + 1;
  }
}

/**
     * Solução otimizada com complexidade de tempo O(n).
     */
    public static List<Integer> sequenceEquation(List<Integer> p) {
        int n = p.size();
        List<Integer> resArray = new ArrayList<>();
        
        // Fase 1: Criar um mapa de posições para busca em tempo O(1).
        // O índice do array representa o valor em 'p', e o valor armazenado
        // no array é a posição (baseada em 1) daquele valor.
        int[] positions = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int value = p.get(i);
            int position = i + 1;
            positions[value] = position;
        }

        // Fase 2: Calcular o resultado usando o mapa de posições.
        for (int x = 1; x <= n; x++) {
            // Encontra a posição do valor x (p(z) = x)
            int midPos = positions[x];
            
            // Encontra a posição do valor midPos (p(y) = midPos)
            int finalPos = positions[midPos];
            
            resArray.add(finalPos);
        }

        return resArray;
    }
