import java.util.concurrent.ArrayBlockingQueue;

public class _724_FindPivotIndex {

    public static int pivotIndex(int[] a) {

        int n = a.length;

        if (n == 1) {
            return 0;
        }
        if (n == 0) {
            return -1;
        }
        int[] arrLeft = new int[n];

        int[] arrRight = new int[n];
        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            arrLeft[i] = (i == 0) ? a[i] : (arrLeft[i - 1] + a[i]);
            arrRight[j] = (j == n - 1) ? a[j] : (arrRight[j + 1] + a[j]);
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (arrLeft[1] == 0) {
                    return i;
                }

            } else if (i == n - 1) {
                if (arrLeft[n - 2] == 0) {
                    return i;
                }
            } else {
                if (arrLeft[i - 1] == arrRight[i + 1]) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a = { 1, 7, 3, 6, 5, 6 };
        int kq = pivotIndex(a);
        System.out.println(kq);
    }
}

// {
// public int pivotIndex(int[] a)
// {
// int n = a.length;
// if(n == 1)
// return 0;

// if(n == 0)
// return -1;

// int[] St = new int[n];

// for (int i = 0; i < n; i++)
// {
// St[i] = (i == 0) ? a[i] : (St[i-1] + a[i]);
// }

// for (int i = 0; i < n; i++)
// {
// int Sp_i = 0;
// if(i == 0){ // 1-n-1
// Sp_i = St[n-1] - a[i];
// if(Sp_i == 0)
// return i;
// }else if(i == n-1){
// if(St[n-2] == 0)
// return i;
// }else{ //
// Sp_i = St[n-1] - St[i];
// if(St[i-1] == Sp_i)
// return i;
// }

// }

// return -1;
// }