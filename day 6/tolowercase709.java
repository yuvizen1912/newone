public class tolowercase709 {
   
    public String toLowerCase(String s) {
        char r[] = s.toCharArray();
        
        for(int i=0;i<s.length();i++){
            if(r[i] >=65 && r[i] <= 90){
                char ch =(char)((int) r[i] + 32) ;
                r[i] = ch;
            }
            else{
                continue;
            }
        }
        return new String(r);
    }

}
