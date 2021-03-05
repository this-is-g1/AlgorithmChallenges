public class OddOccurrecesInArray {
    public int Solution(int[] A) {
        int temp = 0;
        for (int i = 0; i < A.length; i++) {
            temp ^= A[i];
        }
        return temp;
    }
}
