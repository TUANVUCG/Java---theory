package Threading.Threading2;

public class TestThread extends Thread{
    private String threadName;

    public TestThread() {
    }

    public TestThread(String threadName) {
        this.threadName = threadName;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run(){

        for(int i = 0;i<10;i++){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("--------------");
            System.out.println(this.getThreadName()+"  "+i);
        }
    }
}
