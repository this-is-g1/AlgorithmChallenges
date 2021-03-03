import java.util.LinkedList;
import java.util.Queue;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = A.length - 1; i >= 0; i--) {
            queue.add(A[i]);
        }
        for (int i = 0; i < K; i++) {
            queue.add(queue.poll());
        }
        for (int i = A.length - 1; i >= 0; i--) {
            A[i] = queue.poll();
        }
        return A;
    }
}
