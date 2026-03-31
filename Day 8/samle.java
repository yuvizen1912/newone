
class notification{
    void send(){
        System.out.println("sent");
    }
}
class email extends notification{
    String data;
      email(String s){
        this.data = s;
      }
      void send(){
        System.out.println("email was sent:" + data);
      }
}
class sms extends notification{
    String data;
    sms(String s){
        this.data = s;
    }
    void send(){
        System.out.println("sms was sent: "+data);
    }
}

public class samle {
    public static void main(String[] args) {
       notification[] n = { new email("aaa"), new sms("vvvv") };
       for(notification a:n){
        a.send();
       }
        
        
    }
}
