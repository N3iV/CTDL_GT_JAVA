public class _1672_RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        int soDong = accounts.length;
        int soCot = accounts[0].length;
        // int[] tongTaiSan = new int[soDong];
        // for (int i = 0; i < soDong; i++) {
        // int tongTaiSanI = 0;
        // for (int j = 0; j < soCot; j++) {
        // tongTaiSanI += accounts[i][j];
        // }
        // tongTaiSan[i] = tongTaiSanI;
        // if (tongTaiSan[i] > max) {
        // max = tongTaiSan[i];
        // }

        // }

        /*-----------TOI UU CODE ---------------*/
        for (int i = 0; i < soDong; i++) {
            int tongTaiSanI = 0;
            for (int j = 0; j < soCot; j++) {
                tongTaiSanI += accounts[i][j];
            }
            if (tongTaiSanI > max) {
                max = tongTaiSanI;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 3, 2, 1 }, { 3, 4, 5 } };
        int kq = maximumWealth(a);

        System.out.println(kq);
    }
}
