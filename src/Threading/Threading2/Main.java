package Threading.Threading2;

public class Main {
    public static void main(String[] args) {
        TestThread testThread1 = new TestThread("Thread1");
        TestThread testThread2 = new TestThread("Thread2");
        testThread1.start();
        testThread2.start();
    }
}
