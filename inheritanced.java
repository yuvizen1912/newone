
 class battery{
    void powersupply(){
        System.out.println("Still have 40 % power");
    }
}
 class remote{
     /*battery mini = new battery();*/
     battery mini;
     remote(){
        mini = new battery();
     }
   public void changechannel(){
         mini.powersupply();
}
   public void changevolume(){
    System.out.println("Volume is changed");
   }
}
class tv{
    remote tvremote;
    tv(remote tvremote){
        this.tvremote = tvremote;
    }
    public void incvol(){
        tvremote.changevolume();
    }
}


public class inheritanced {
    public static void main(String[] args) {
        remote tvr = new remote();
                                      /*both objects are independent they are declared independlty in main - it is aggregation */
                                      /*objects are dependent as they are not declared in classs = they are composition */
        tv sony = new tv(tvr);
        sony.incvol();
    }
}
