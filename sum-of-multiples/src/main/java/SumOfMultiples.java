import java.awt.*;
import java.util.HashSet;
import java.util.Set;

class SumOfMultiples {
    public SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
    }

    int number;
    int[] set;


    int getSum() {
        Set<Integer> listaInt = new HashSet<>();
        for (int i = 1; i < number; i++) {
            for (int j = 0; j < set.length; j++) {
                if (set[j] == 0) {
                    break;
                }
                if (i % set[j] == 0) {
                    listaInt.add(i);
                }
            }
        }
        return listaInt.stream().mapToInt(Integer::intValue).sum();
    }

}
