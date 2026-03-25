public class split1221 {
    

    public int balancedStringSplit(String s) {
        int ctr = 0;
        int balance = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R')
                balance++;
            else
                balance--;
            if (balance == 0) {
                ctr++;
            }
        }
        return ctr;
    }

}
