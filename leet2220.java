public class leet2220 {
    
    public int minBitFlips(int start, int goal) {
        int ans  = 0;
        int val = start ^ goal;
        while(val !=0 ){
            ans += val & 1;
            val >>=1;
        }
        return ans;
    }
    
}

