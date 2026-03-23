public class string {
    public static void main(String[] args) {
        String s = "Java Programming bala murugan";
        String[] chr = s.split(" ");
        for(int i = 0;i<chr.length;i++){
            System.out.println(chr[i]);
        }
        System.out.println(s.length());
        System.out.println(s.substring(1,4));
        System.out.println(s.equals("logo"));
        s = s.replace(" ","@");
        System.out.print(s);
        System.out.print(s.split("P"));
        for(char ch: s.toCharArray()){
            System.out.println(ch);
        }
        char[] ch = s.toCharArray();
        int c =0;
        for(char cha: ch){
            c++;
        }
        System.out.print(c);
        /*
        System.out.println(ch);
        System.out.println(new String(ch));
        String str = new String(ch);
        System.out.println(str); */
        System.out.print(ch.length);
    }
}
