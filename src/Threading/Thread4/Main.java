package Threading.Thread4;

public class Main {
    public static void main(String[] args) {
        EvenClass evenClass = new EvenClass();
        OddClass oddClass = new OddClass();

        Thread thread1 = new Thread(evenClass);
        Thread thread2 = new Thread(oddClass);
        thread1.start();
        thread2.start();
        }
    }

