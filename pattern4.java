public class pattern4 {
    public static void main(String[] args) {
        int n = 5;
        int d = n - 1;
        
        for(int i=0;i<n;i++){
            for(int k = 0;k<=n - i- 1;k++){
                System.out.print(" ");
            }
            for(int j = 1;j<2*(i+ 1);j++){
                System.out.print("*");
            }
            d--;
            System.out.println(" ");
             
        }
    }
}
