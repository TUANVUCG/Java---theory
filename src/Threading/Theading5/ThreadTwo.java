package Threading.Theading5;

public class ThreadTwo implements Runnable{

    ThreadOne threadOne;

    public ThreadTwo() {
    }


    @Override
    public void run() {
        for(int i = 0; i <10;i++){
            System.out.println("ThreadTwo "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
