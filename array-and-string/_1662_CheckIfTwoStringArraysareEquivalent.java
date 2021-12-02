public class _1662_CheckIfTwoStringArraysareEquivalent {
    // public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    // String r1= "";
    // String r2 ="";
    // for(int i=0 ;i <word1.length;i++){
    // r1+=word1[i];
    // }
    // for(int i=0;i<word2.length;i++){
    // r2+=word2[i];
    // }
    // return r1.equals(r2);
    // }

    /*----------DUNG STRINGBUILDER ---------*/
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String string : word2) {
            sb2.append(string);
        }
        for (String string : word1) {
            sb1.append(string);
        }
        return sb1.toString().equals(sb2.toString());
    }
}
