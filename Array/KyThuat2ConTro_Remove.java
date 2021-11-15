package Array;
public class KyThuat2ConTro_Remove {
    public static int removeElement(int a[], int x) {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != x) {
                a[k] = a[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int a[] = { 2, 3, 3, 4, 3, 3, 2 };
        System.out.println(removeElement(a, 3));
        System.out.println("DONE");
    }
}
