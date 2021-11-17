
public class _283_MoveZeroes {
    public static void moveZeroes(int[] a) {
        int currentIdx = 0;
        for (int i = 0; i < a.length;) {
            if (a[i] != 0) {
                a[currentIdx] = a[i];
                currentIdx++;
            }
        }
        for (; currentIdx < a.length; currentIdx++) {
            a[currentIdx] = 0;
        }

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 0, 4, 5, 0, 3 };
        moveZeroes(a);
    }
}
