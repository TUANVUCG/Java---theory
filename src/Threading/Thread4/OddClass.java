package Threading.Thread4;

public class OddClass extends Thread{
    @Override
    public void run() {
        for(int i = 1;i<10;i+=1){
            System.out.println(i);
        }
    }
}
