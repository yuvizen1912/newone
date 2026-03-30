

public class wave {
     static String  Wave (String s){

        StringBuilder str = new StringBuilder();
        
        for(int i = 0;i<s.length();i+= 2){
            str.append(s.charAt(i));
        }
        for(int i=1;i<s.length();i+=2){
            str.append(s.charAt(i));
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String s = "";
        System.out.println(Wave(s));
    }
}
