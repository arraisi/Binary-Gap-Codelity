// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String Binary = Integer.toBinaryString(N);
        int BandGapTemporary = 0;
        int BandGap = 0;
        for (int i=0 ; i<Binary.length(); i++){
            if (Binary.charAt(i) == '0'){
                BandGapTemporary++;
            } else {
                if (BandGap < BandGapTemporary) {
                    BandGap = BandGapTemporary;
                    BandGapTemporary = 0;
                } else {
                    BandGapTemporary = 0;
                }
            }
        }
        return BandGap;
    }
}
