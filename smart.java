abstract class SmartDevice{
    abstract void turnon();
    abstract void turnoff();
    void light(){
        System.out.print("Light is on");
    }

}
class Light extends SmartDevice{
    @Override
    void turnon(){
        System.out.println("Lights turn on");

    }
    @Override
    void turnoff(){
        System.out.println("light turn off");
    }
}
interface remote{
    void change();
}
class tv implements  remote{
    @Override
    public void change(){
        System.out.print("Change channel");
    }
}


public class smart {
    public static void main(String[] args){
           SmartDevice device = new Light();
           device.turnon();
           device.light();
           remote r = new tv();
           r.change();
    }
}
