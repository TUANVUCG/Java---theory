package Threading.Thread3;

public class Main {
    public static void main(String[] args) {
        TestThread testThread1 = new TestThread();
        testThread1.setName("Thread1");

        TestThread testThread2 = new TestThread();
        testThread1.setName("Thread2");

        TestThread testThread3 = new TestThread();
        testThread1.setName("Thread3");

        testThread1.start();
        testThread2.start();
        testThread3.start();

    }
}
