package Threading.Theading5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Thread main start !!!");
        ThreadOne threadOne = new ThreadOne();
        Thread thread1 = new Thread(threadOne);
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }





        System.out.println("Start thread main stop !!!");
    }
}
