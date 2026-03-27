public class nonrep {
    public static void main (String[] args){
           String s = "abcbad";
           int l = s.length();
           /*for(int i=0;i<l;i++){
            int c = 0;
            for(int j = i + 1;j<l;j++){
                if(s.charAt(i) != s.charAt(j)){
                     c++;
                }
                else{
                    break;
                }
            }
            if(c == (l - (i + 1))){
                System.out.print(s.charAt(i));
                break;
            }
           }*/
          int[] freq = new int[26];
          for(int i =0;i<l;i++){
             char c = s.charAt(i);
             freq[c - 'a']++;

          }
          
          for(int i =0;i<26;i++){
            if(freq[i] == 1){
                System.out.println((char)(i + 65));
                break;
            }
          }
    }
}
