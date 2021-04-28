package Threading.Thread3;

public class TestThread extends Thread{

    @Override
    public void run(){
        for(int i = 0;i<10;i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName()+"   "+i);
        }
    }
}
