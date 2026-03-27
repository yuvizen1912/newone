package day7;

public class LongestSubstringWithoutRepeatingCharacters {
   
    
    public boolean isd(String s){
        if(s.length() == 1) return true;
        char[] ch = s.toCharArray();
        for(int i =0;i<s.length();i++){
            for(int j= i + 1;j<ch.length;j++){
                char c = ch[j];
                if(c == s.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
    public int lengthOfLongestSubstring(String s) {
        int c = 0;
       
        
        int l = s.length();
        if(l == 0){
            return 0;
        }
        if(l == 1){
            return 1;
        }
        if(isd(s.substring(0,l))){
            return l;
        }
       
        for(int i=0;i<l- 1;i++){
            int g =0;
            
            for(int j= i + 1;j<l;j++){
                String v = s.substring(i,j + 1);
              
                if(isd(v)){
                    c = Math.max(c,v.length());
                }

            }
            
        }
        if(c == 0){
            return 1;
        }
        return c;
    }

}
