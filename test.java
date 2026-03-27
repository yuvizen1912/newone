
public class test{
    public static int countw(String s){
        String v = s.trim();
        int l = v.length();
        int c =0;
        if(l == 1){
            return 1;
        }
        for(int i=0;i<l;i++){
            if(v.charAt(i) == ' ' ){
                if((v.charAt(i - 1) != ' ')){
                    c++;
                }

            }
            if(i == l - 1 && (v.charAt(i - 1) != ' ') ){
                c++;
            }
        }
        return c;
    }
    /*public static boolean ischar(char c){
        if((c >= 65 && c<=90) || (c>=97 && c<=122)){
            return true;
        }
        return false;
    }*/
    public static void main(String[] args) {
        int r = countw("   hi                       ");
        System.out.print(r);
    }
}