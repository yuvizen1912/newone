public class mergealternatively {
    
    public String mergeAlternately(String word1, String word2) {
        
        int l1 = word1.length();
        int l2 = word2.length();
        int i=0,j=0;
         StringBuilder nums = new StringBuilder();
         while(i<l1 &&  j<l2){
            nums.append(word1.charAt(i));
            nums.append(word2.charAt(j));
            i++;
            j++;
         }
         while(i<l1){
            nums.append(word1.charAt(i));
            i++;
         }
         while(j<l2){
            nums.append(word2.charAt(j));
            j++;
         }
         return nums.toString();
        
    }

}
