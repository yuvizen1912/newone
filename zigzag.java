public class zigzag {
    public static void main(String[] args){
        String s = "PAYPALISHIRING";
        int l = s.length();
        int nr = 3;
        int i =0;
        int x ;
        StringBuilder res = new StringBuilder();
        while(i<nr){
            if(i % 2 == 0){
                x = (nr- 1)*2;

            }
            else{
                x = nr - 1;
            }
            for(int j = i;j<l;j+=x){
                res.append(s.charAt(j));
            }
            i++;
        }
        System.out.print(res.toString());
    }
}
