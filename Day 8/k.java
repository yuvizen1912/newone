public class k {
    public static void main(String[] args) {
        int i =0;
        String s = "HELLO";
        int n = 5;
        int m = n / 2 ;
        int l = m + 1;
        int left = 0;
        int right = n - 1;
        while(l >=1){
            
            System.out.print(s.charAt(left));
            
            System.out.print(" ".repeat(l));
            
            System.out.println(s.charAt(right));
            left++;
            right--;
        
        
        l--;}
        
       
        
        while(l  <= m){
            
            System.out.print(s.charAt(left));
            
            System.out.print(" ".repeat(l));
            
            System.out.println(s.charAt(right));
            left++;
            right--;
            l++;

        }

    }
}
