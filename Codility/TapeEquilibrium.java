import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TapeEquilibrium {
    public int Solution(int[] A) {
        List<Integer> list = new ArrayList<Integer>();
        int left = 0, right, sum = 0;
        for (int i : A) sum += i;
        for (int j = 0; j < A.length; j++) {
            left += A[j-1];
            right = sum - left;
            list.add(Math.abs(left - right));
        }
        return (int)Collections.min(list);
    }
}
