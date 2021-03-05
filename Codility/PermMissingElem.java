public class PermMissingElem {
    public int solution(int[] A) {
        long len = A.length + 1;
        long sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return (int)(len * (len + 1) / 2 - sum);
    }
}
