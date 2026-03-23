public class pattern5 {
    public static void main(String[] args) {
        int n = 5;
       
        int d = n - 1;
        
        for(int i=0;i<n;i++){
            for(int k = 0;k<i;k++){
                System.out.print(" ");
            }
            for(int j = 1;j<2*(n - i);j++){
                System.out.print("*");
            }
            
            System.out.println(" ");
             
        }
    }
}
