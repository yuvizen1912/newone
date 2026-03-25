public class reversevowels {
    
    public boolean isv(char c ){
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e'||c == 'i'||c=='o' || c == 'u');
    }
    public String reverseVowels(String s) {
        
        char[] ch = s.toCharArray();
        int left =0;
        int right = ch.length - 1;
        while(left<right){
             boolean lv = isv(ch[left]);
             boolean rv = isv(ch[right]);
            if(lv && rv){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
            
            left++;
            right--;
            }
           else if(lv && !rv){
                     right--;
            }
            else if(!lv && rv){
                     left++;
            }
            else{
                left++;
                right--;
            }

        }
        return new String(ch);
        
    }
    

}
