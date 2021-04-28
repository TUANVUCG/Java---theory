package Abstract_and_Interface.Interface;

import Abstract_and_Interface.Interface.MyInterface;

public class Money implements MyInterface {
    @Override
    public void saySomething(){
        System.out.println("Say something");
    }
}
