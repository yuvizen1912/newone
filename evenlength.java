public class evenlength {
    public static void even(String s){
           int l =0;
           StringBuilder str = new StringBuilder();
           for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c!= ' '){
                str.append(c);
            }
            else{
                if(str.length() % 2 == 0 && str.length() > 0){
                System.out.println(str.length());
                System.out.println(str);
                }
                str.setLength(0);
            }


        }
    }
    
    public static void main(String[] args) {
        String s = " sree ";
       even(s);
    }
}
