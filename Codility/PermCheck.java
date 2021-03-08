import java.util.Arrays;

public class PermCheck {
    public int solution(int[] A) {
        int cur = 1;
        int flag = 1;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (cur != A[i]) {
                flag = 0;
                break;
            }
            cur++;
        }
        return flag;
    }
}
