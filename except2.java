public class except2 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try{
                System.out.println("thread sleep");
                Thread.sleep(5000);
                System.out.println("thread wake");
            }
            catch(InterruptedException e){
                System.out.println("Sleep Interuption");

            }
        });
        t.start();
        try{
                 Thread.sleep(6000);
                 System.out.println("MAIN METHOD THREAD");
        }
        catch(InterruptedException e){
            System.out.println("Not T");
        }
        t.interrupt();

    }

}
