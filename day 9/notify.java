 class NOT {
    String name,message;
    void send(){
        System.out.print("notify");
    }
    NOT(String name,String message){
        this.name = name;
        this.message = message;
    }
}
class email extends NOT{
    email(String name,String message){
        super(name,message);
    }
    void send(){
        System.out.println("email sent to "+name);
         System.out.println("messagge:"+message);

    }
    void change(){
        System.out.println("change");
    }
    
}
class sms extends NOT{
    sms(String name,String message){
        super(name,message);
    }
    void send(){
        System.out.println("sms");
        System.out.println("messagge:"+message);
    }
}
public class notify{
    public static void main(String[] args) {
       /* (NOT n = new email();
        n.send();// send function of sms will be executed as only the sms object is created.
        /*n.change();*/ /* change function can not be accessed becoz the function is not defined in change, the varianble gets its behaviour from  
                       and function from not  , refernce to control access // object to control behaviour*/
        //n = new sms();
       // n.send();)
       NOT n;
       n = new email("test","Order confirmed");
       n.send();
       n = new sms("test2","OTP is 234");
       n.send();


    }
}
