import java.util.Arrays;

public class MissingInteger {
    public int solution (int[] A) {
        int flag = 1;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] == flag) {
                flag++;
            }            
        }
        return flag;
    }
}
