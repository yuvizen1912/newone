public class zigzag {
    public static void main(String[] args){
        String s = "PAYPALISHIRING";
        int l = s.length();
        int nr = 3;
        /*int i =0;
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
        System.out.print(res.toString());*/
        StringBuilder [] rows = new StringBuilder[nr];
        for(int i =0;i<nr;i++){
            rows[i] = new StringBuilder();

        }
        boolean gu = false;
        int curr = 0;
        for(char c:s.toCharArray()){
            rows[curr].append(c);
            
            if(curr == 0 || curr == nr- 1  ){
                gu = !gu;
            }
            if(gu){
                curr+= 1;
            }
            else{
            curr+= -1;}
           
        }
        StringBuilder ans = new StringBuilder();
        for(StringBuilder r:rows){
            ans.append(r);
        }
        System.out.println(ans.toString());

    }
}
