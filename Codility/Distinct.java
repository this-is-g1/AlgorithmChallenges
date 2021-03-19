import java.util.HashSet;
import java.util.Set;

class Distinct {
    public int Solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int num : A) {
            set.add(num);
        }
        return set.size();
    }
}